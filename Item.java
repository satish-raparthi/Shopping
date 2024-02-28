package system;

public class Item {
	private int ItemNo;
	private String ItemName;
	private double itemPrice;
	private double itemQuantity;

	public int getItemNo() {
		return ItemNo;
	}

	public void setItemNo(int itemNo) {
		ItemNo = itemNo;
	}

	public String getItemName() {
		return ItemName;
	}

	public void setItemName(String itemName) {
		ItemName = itemName;
	}

	public double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}

	public double getItemQuantity() {
		return itemQuantity;
	}

	public void setItemQuantity(double itemQuantity) {
		this.itemQuantity = itemQuantity;
	}

	public Item(int itemNo, String itemName, double itemPrice, double itemQuantity) {
		ItemNo = itemNo;
		ItemName = itemName;
		this.itemPrice = itemPrice;
		this.itemQuantity = itemQuantity;
	}
}
