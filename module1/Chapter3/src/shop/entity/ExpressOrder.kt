package shop.entity

open class ExpressOrder(
    orderId: Long,
    status: String,
    protected var expressFee: Double
) : Order(orderId, status) {
    override fun displayInfo() {
        println("Order #:$orderId - Order Status: $status - Express Fee: $expressFee")
    }
}