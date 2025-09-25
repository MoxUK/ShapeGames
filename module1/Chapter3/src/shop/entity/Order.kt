package shop.entity

import shop.entity.status.OrderStatus
import shop.service.Trackable

class Order(
    private val orderID: Int,
    private val user: User,
    private val products: List<Product>,
    private val deliveryAddress: Address,
    private var status: OrderStatus = OrderStatus.PENDING
): Trackable {
    open fun totalAmount(): Double   {
        return products.sumOf { it.price }
    }


    open fun displayInfo()   {
        println("Order #$orderID for ${user.name} - Order Status: $status")
        println("Delivery Address: $deliveryAddress")
        println("Products:")
        products.forEach{product: Product ->
            println(" - ${product.name} @ ${product.price}")
        }
        println("Total:${totalAmount()}")
    }

    override fun track()    {
        println("Order #$orderID for ${user.name}")
    }

    fun getStatus(): OrderStatus {
        return status
    }

    fun setStatus(newStatus: OrderStatus)   {
        status = newStatus
    }

    fun getId(): Int {
        return orderID
    }

    fun getUser(): User{
        return user
    }

    fun getProduct(): List<Product> {
        return products
    }

    fun getDeliveryAddress(): Address    {
        return deliveryAddress
    }
}

/*
open class Order(val orderId: Long, val status: String) {
    open fun displayInfo()   {
        println("Order #:$orderId - Order Status: $status")
    }

}
*/

