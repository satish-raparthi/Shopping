package system;
import java.util.*;
public class Order {
	private int Orderid;
	List<Item> items = new ArrayList<>();
	private String OrderedDate;
	private double totalAmount;

	public Order(int Orderid) {
		this.Orderid = Orderid;
		this.OrderedDate = ("2024/02/26");
		this.totalAmount = 999.00;

		items.add(new Item(1, "Pen", 5.0, 2));
		items.add(new Item(5, "Penciol", 10.0, 2));
		items.add(new Item(4, "Eraser", 12.3, 2));
		items.add(new Item(3, "Box", 50.2, 2));
		items.add(new Item(2, "Mobile", 51.0, 2));
	}

	public int getOrderid() {
		return Orderid;
	}

	public void setOrderid(int orderid) {
		Orderid = orderid;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public String getOrderedDate() {
		return OrderedDate;
	}

	public void setOrderedDate(String orderedDate) {
		OrderedDate = orderedDate;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
}
