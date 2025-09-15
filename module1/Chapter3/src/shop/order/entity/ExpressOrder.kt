package shop.order.entity
import shop.user.entity.User

open class ExpressOrder(
    orderId: Long,
    user: User,
    protected var expressFee: Double,
    private val baseAmount: Double
) : Order(orderId, user) {

    override fun totalAmount(): Double{
        return baseAmount + expressFee
    }

    override fun displayInfo() {
        println("Order #:orderId for ${user.name} - Express Fee: $expressFee - " +
                "Total: ${totalAmount()}")
    }
}