package shop.order.service.impl

import shop.order.entity.Order
import shop.order.service.OrderService
import shop.bankaccount.service.AccountService

class OnlineOrderService(
    private val accountService: AccountService
) : OrderService {
    override fun processOrder(order: Order): Boolean{
        val amount = order.totalAmount()
        val success = accountService.withdraw(order.user.account, amount)
        if (success)    {
            println("Order #${order.orderID} processed successfully for ${order.user.name}. Amount: $amount")
        } else {
            println("Order #${order.orderID} failed for ${order.user.name}. Not enough money available")
        }
        return success
    }
}