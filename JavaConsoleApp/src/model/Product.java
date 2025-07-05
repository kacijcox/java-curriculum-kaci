package model;

import java.util.HashMap;

public class Product {
	public static HashMap<Object, Object> products;
	public int productID;
	public String productName;
	public int productQuantity;
	public double productPrice;

	public Product(int productID, int productQuantity, String productName, double productPrice) {
		this.productID = productID;
		this.productQuantity = productQuantity;
		this.productName = productName;
		this.productPrice = productPrice;
	}


	public int getProductID() {return productID;}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		return "Product{" +
				"productID=" + productID +
				", productName='" + productName + '\'' +
				", productQuantity=" + productQuantity +
				", productPrice=" + productPrice +
				'}';
	}
}