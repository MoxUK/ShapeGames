package shop
import shop.entity.BankAccount
import shop.entity.User
import shop.service.impl.AccountServiceImpl
import shop.service.impl.OnlineOrderService
// import shop.entity.ExpressOrder
// import shop.entity.GiftOrder


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
    val user = User(11,"Alice", )

    user.showBalance()

    val accountService = AccountServiceImpl()
    val orderService = OnlineOrderService(accountService)

    //val expressOrder = ExpressOrder(1001L, user, 10.0, 40.0)
    //expressOrder.displayInfo()

    //val giftOrder = GiftOrder(2002L, user, 3.0, 7.0, "Happy Birthday")
    //giftOrder.displayInfo()

    //orderService.processOrder(expressOrder)
    //orderService.processOrder(giftOrder)
    user.showBalance()


}