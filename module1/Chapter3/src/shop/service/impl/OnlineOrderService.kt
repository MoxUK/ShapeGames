package shop.service.impl

import shop.entity.Order
import shop.service.OrderService
import shop.service.AccountService


class OnlineOrderService(
    private val accountService: AccountService
) : OrderService {
    override fun processOrder(order: Order): Boolean{
        val account = order.getUser().getAccount()
        val amount = order.totalAmount()

        val success = accountService.withdraw(account, amount)
        if (success)    {
            println("Order #${order.getId()} processed successfully for ${order.getUser().name}. Amount: $amount")
        } else {
            println("Order #${order.getId()]} failed for ${order.getUser().name}. Not enough money available")
        }
        return success
    }
}