package shop.order.service
import shop.order.entity.Order

interface OrderService {
    fun processOrder(order: Order): Boolean
}