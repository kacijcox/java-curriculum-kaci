package model;

public class PerishableProduct {
	public boolean isPerishable;

	public PerishableProduct(boolean isPerishable) {
		this.isPerishable = isPerishable;
	}

	public boolean isPerishable() {
		return isPerishable;
	}

	public void setPerishable(boolean perishable) {
		isPerishable = perishable;
	}

}
