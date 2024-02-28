package system;
import java.util.*;
public class Publisher {
	Queue<Order>orders;
	public Publisher(Queue<Order> orders) {
        this.orders = orders;
    }
    public void placeOrder(Order order) {
        synchronized (orders) {
            orders.add(order);
            orders.notify();
        }
    }
}
