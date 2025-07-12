package model;
import java.util.HashMap;

public class Product extends PerishableProduct {
	private int productID;
	private String productName;
	private int productQuantity;
	private double productPrice;
	private boolean isPerishable;
	Product product;

	public static HashMap<String, Product> products = new HashMap<String, Product>();

	public Product() {
		super(false);
		this.productID = 0;
		this.productName = "";
		this.productQuantity = 0;
		this.productPrice = 0.0;
		this.isPerishable = false;
		this.product = null;
	}

	public Product setAllProduct (int productID, int productQuantity, String productName, double productPrice, boolean isPerishable) {
		this.isPerishable = isPerishable;
		this.productID = productID;
		this.productQuantity = productQuantity;
		this.productName = productName;
		this.productPrice = productPrice;
		return this;
	}

	public Product parseCsvLineToProduct(String[] csvLine) {
		int productID = Integer.parseInt(csvLine[0]);
		String productName = csvLine[1];
		double productPrice = Double.parseDouble(csvLine[2]);
		int productQuantity = Integer.parseInt(csvLine[3]);
		boolean isPerishable = Boolean.parseBoolean(csvLine[4]);

		Product product = new Product();
		product.setAllProduct(productID, productQuantity, productName, productPrice, isPerishable);
		return product;
	}

	public Product formatUpdateProductGetter() {
		System.out.println("===== Inventory List =====");
		System.out.println("ID | Name | Quantity | Price | Perishable");
		System.out.println("-----------------------------------------");
		System.out.printf("%d | %s | %d | $%.2f%n | %b%n", // print the new product information
				product.getProductID(),
				product.getProductName(),
				product.getProductQuantity(),
				product.getProductPrice(),
				product.getPerishable());
		return product;
	}

	public String productHeader() {
		return "Product ID | Product Name | Price | Quantity | Perishable\n";
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