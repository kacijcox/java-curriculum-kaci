package errorhandling;

import model.Product;

public class HandleError {
	private Product product;

	public void handleEmptyError(Product product) {
		if (product.getProductID() < 0) {
			throw new IllegalArgumentException("Product ID Cannot Be Less Than 0");
		}
		if (product.getProductName().isEmpty()) {
			throw new IllegalArgumentException("Product Name Cannot Be Empty");
		}
		if (product.getProductQuantity() < 0) {
			throw new IllegalArgumentException("Product Quantity Cannot Be Less Than 0");
		}
		if (product.getProductPrice() < 0.0) {
			throw new IllegalArgumentException("Product Price Cannot Be Less Than 0");
		}
	}
}

