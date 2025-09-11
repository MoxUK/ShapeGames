package shop
import shop.entity.GiftOrder
import shop.entity.ExpressOrder
import shop.entity.Order


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
    val order = Order(1001L, "pending")
    order.displayInfo()

    val express = ExpressOrder(1002L, "Shipped", 10.25)
    express.displayInfo()

    val gift = GiftOrder(1003L, "Shipped", 11.25, "This is a msg" )
    gift.displayInfo()

}