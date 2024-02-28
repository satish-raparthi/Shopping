package system;

import java.util.Queue;

public class Consumer extends Thread {
    private Queue<Order> shoppingCart;

    public Consumer(Queue<Order> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }
    public void run() {
        while (true) {
            synchronized (shoppingCart) {
                try {
                    while (shoppingCart.isEmpty()) {
                        shoppingCart.wait();
                    }
                    Order order = shoppingCart.poll();
                    int orderId = order.getOrderid();
                    Thread emailThread = new Thread(()-> {
                        System.out.println("Mail sent for the order " + orderId);
                        System.out.println("-----------Order Details:-------------");
                        System.out.println("Order Id: " + order.getOrderid());
                        for (Item item:order.getItems()) {
                            System.out.println("- " + item.getItemName() + ": Price: " + item.getItemPrice() + ", Quantity: " + item.getItemQuantity());
                        
                        }
                        System.out.println("Ordered Date: " + order.getOrderedDate());
                        System.out.println("Total Amount: " + order.getTotalAmount());
                        
                    });
                    emailThread.start();
                    emailThread.join();
                    Thread whatsappThread = new Thread(() -> {
                        System.out.println("WhatsApp message sent for the order " + orderId);
                        System.out.println("-----------Order Details:--------------");
                        System.out.println("Order Id: " + order.getOrderid());
                        for (Item item:order.getItems()) {
                            System.out.println("- " + item.getItemName() + ": Price: " + item.getItemPrice() + ", Quantity: " + item.getItemQuantity());
                        
                        }
                        System.out.println("Ordered Date: " + order.getOrderedDate());
                        System.out.println("Total Amount: " + order.getTotalAmount());
                    });
                    whatsappThread.start();
                    whatsappThread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
