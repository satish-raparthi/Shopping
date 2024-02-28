package system;
import java.util.*;
public class ShoppingDemo {

	public static void main(String[] args) throws InterruptedException {
		Queue<Order> shoppingCart = new LinkedList<>();
        Publisher publisher = new Publisher(shoppingCart);
        Consumer consumer = new Consumer(shoppingCart);
        consumer.start();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter order id (or -1 to exit): ");
            int orderId = scanner.nextInt();
            if (orderId == -1) {
                break;
            }
            publisher.placeOrder(new Order(orderId));
        }
        scanner.close();
    }
}
