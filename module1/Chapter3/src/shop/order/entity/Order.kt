package shop.order.entity
import shop.user.entity.User

abstract class Order(
    val orderID: Long,
    val user: User
){
    abstract fun totalAmount(): Double

    open fun displayInfo()   {
        println("Order #:orderId - Order Status: status")
    }
}

/*
open class Order(val orderId: Long, val status: String) {
    open fun displayInfo()   {
        println("Order #:$orderId - Order Status: $status")
    }

}
*/

