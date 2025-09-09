package shop.entity

open class Order(val orderId: Long, val status: String) {
    open fun displayInfo()   {
        println("Order #:$orderId - Order Status: $status")
    }

}

