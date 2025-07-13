package model;
import objects.ConsoleUI;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;

public class Product {
	private int productID;
	private String productName;
	private int productQuantity;
	private double productPrice;
	private boolean isPerishable;


	public static HashMap<String, Product> products = new HashMap<String, Product>();

	public Product setAllProduct(boolean isPerishable, int productID, String productName, int productQuantity, double productPrice) {
		this.productID = productID;
		this.productName = productName;
		this.productQuantity = productQuantity;
		this.productPrice = productPrice;
		this.isPerishable = isPerishable;
		return this;
	}

	public Product parseCsvLineToProduct(String[] csvLine) {
		int productID = Integer.parseInt(csvLine[0]);
		String productName = csvLine[1];
		double productPrice = Double.parseDouble(csvLine[2]);
		int productQuantity = Integer.parseInt(csvLine[3]);
		boolean isPerishable = Boolean.parseBoolean(csvLine[4]);

		Product product = new Product();
		product.setAllProduct(isPerishable, productID, productName, productQuantity, productPrice);
		return product;
	}

	public void formatUpdateProductGetter() {
		String s = " ".repeat(5);
		System.out.println("=========================================================");
		System.out.println("Product ID | Product Name | Price | Quantity | Perishable | Expiration Date");
		System.out.printf("%d" + s + "|" + s + "%s" + s + "|" + s + "$%.2f" + s + "|" + s + "%d" + s + "|" + s + "%b%n",
				productID,
				productName,
				productPrice,
				productQuantity,
				isPerishable
				);
	}

	public void ifPerishable() {

	}

	public String productHeader() {
		return "Product ID | Product Name | Price | Quantity | Perishable \n";
	}

	public boolean getPerishable() {
		return isPerishable;
	}

	public int getProductID() {
		return productID;
	}

	public int setProductID(int productID) {
		this.productID = productID;
		return productID;
	}

	public String getProductName() {
		return productName;
	}

	public String setProductName(String productName) {
		this.productName = productName;
		return productName;
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public int setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
		return productQuantity;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public double setProductPrice(double productPrice) {
		this.productPrice = productPrice;
		return productPrice;
	}

	public String toCsvString() {
		return productID + "," +
				productName + "," +
				productPrice + "," +
				productQuantity + "," +
				isPerishable;
	}

	@Override
	public String toString() {
		return "Product{" +
				"productID=" + productID +
				", productName='" + productName + '\'' +
				", productQuantity=" + productQuantity +
				", productPrice=" + productPrice +
				", isPerishable=" + isPerishable +
				'}';
	}
}