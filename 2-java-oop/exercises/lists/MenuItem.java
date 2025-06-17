package lists;

public class MenuItem extends ListExercise{
	int itemNumber;
	String itemName;
	int orderNumber;

	public MenuItem(int itemNumber, String itemName, int orderNumber) {
		this.itemNumber = itemNumber;
		this.itemName = itemName;
		this.orderNumber = orderNumber;
	}

	public int getItemNumber() {
		return itemNumber;
	}

	public void setItemNumber(int itemNumber) {
		this.itemNumber = itemNumber;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}

	@Override
	public String toString() {
		return "MenuItem{" +
				"itemNumber=" + itemNumber +
				", itemName='" + itemName + '\'' +
				", orderNumber=" + orderNumber +
				'}';
	}
}
