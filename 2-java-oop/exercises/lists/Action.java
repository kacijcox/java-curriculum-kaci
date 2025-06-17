package lists;

public class Action {
	MenuItem menuItem;
	boolean addToOrder;


	public Action(MenuItem menuItem, boolean addToOrder) {
		this.menuItem = menuItem;
		this.addToOrder = addToOrder;
	}


	public MenuItem getMenuItem() {
		return menuItem;
	}

	public void setMenuItem(MenuItem menuItem) {
		this.menuItem = menuItem;
	}

	public boolean isAddToOrder() {
		return addToOrder;
	}

	public void setAddToOrder(boolean addToOrder) {
		this.addToOrder = addToOrder;
	}
}
