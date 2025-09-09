package shop.entity

class GiftOrder (
    orderId: Long,
    status: String,
    expressFee: Double,
    val giftMessage: String
) : ExpressOrder(orderId, status, expressFee)  {
    override fun displayInfo()  {
        println("Order #:$orderId - Order Status: $status - Express Fee: $expressFee\n" +
                "Gift Message: $giftMessage")
    }
}

