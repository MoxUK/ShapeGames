package shop
import shop.entity.BankAccount
import shop.entity.User
import shop.service.impl.AccountServiceImpl
import shop.service.impl.OnlineOrderService
//import shop.entity.ExpressOrder
//import shop.entity.GiftOrder


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


    cart.addProducts(p1)
    cart.addProducts(p2)
    cart.addProducts(p3)

    val accountService = AccountServiceImpl()
    val orderService = OnlineOrderService(accountService)

    val order = Order(101, user, cart.getProducts(), address)

    order.displayInfo()
    order.track()
    orderService.processOrder(order)
    order.track()

    user.showBalance()
    println("------------------")
    orderService.cancelOrder(order)
    user.showBalance()



}