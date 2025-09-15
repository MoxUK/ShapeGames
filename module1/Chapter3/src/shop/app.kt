package shop
import shop.order.service.OrderService
import shop.bankaccount.entity.BankAccount
import shop.user.entity.User
import shop.bankaccount.service.impl.AccountServiceImpl
import shop.order.service.impl.OnlineOrderService
import shop.order.entity.Order
import shop.order.entity.ExpressOrder
import shop.order.entity.GiftOrder


/**
Task 2: Online Orders
You are working on an online shopping system.
There is a class Order with properties like orderId and status,
and a function displayInfo() that shows basic info about the order.
Make a class ExpressOrder that comes from Order and adds the property expressFee.
Override displayInfo() in ExpressOrder so it shows all order info plus the express fee.
Make another class GiftOrder that comes from ExpressOrder and adds a property giftMessage.
Override displayInfo() in GiftOrder so it shows all info, fee, and the gift message.
Extra:
Use access modifiers so that expressFee can only be changed inside ExpressOrder and its subclasses, but not from outside.
 */

fun main()  {
  /*  val order = Order(1001L, "pending")
    order.displayInfo()

    val express = ExpressOrder(1002L, "Shipped", 10.25)
    express.displayInfo()

    val gift = GiftOrder(1003L, "Shipped", 11.25, "This is a msg" )
    gift.displayInfo()*/

    val account = BankAccount(balance = 100.00)
    val user = User("Alice", account)

    user.showBalance()

    val accountService = AccountServiceImpl()
    val orderService = OnlineOrderService(accountService)

    val expressOrder = ExpressOrder(1001L, user, 10.0, 40.0)
    expressOrder.displayInfo()

    val giftOrder = GiftOrder(2002L, user, 3.0, 7.0, "Happy Birthday")
    giftOrder.displayInfo()

    orderService.processOrder(expressOrder)
    orderService.processOrder(giftOrder)
    user.showBalance()


}