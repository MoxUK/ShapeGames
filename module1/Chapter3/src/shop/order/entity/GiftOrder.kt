package shop.order.entity
import shop.user.entity.User

class GiftOrder (
    orderID: Long,
    user: User,
    expressFee: Double,
    baseAmount: Double,
    val giftMessage: String
) : ExpressOrder(orderID, user, expressFee, baseAmount)  {
    override fun displayInfo()  {
        println("Order #:$orderID for ${user.name} - Express Fee: $expressFee - Total: ${totalAmount()} - " +
                "Gift Message: $giftMessage")
    }
}


