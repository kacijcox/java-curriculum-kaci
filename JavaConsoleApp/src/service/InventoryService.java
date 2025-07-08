//business logic
//user interaction
//repo calls

package service;
import data.InventoryRepository;
import model.Product;
import java.io.IOException;
import java.util.ArrayList;
import static model.Product.products;
import static ui.MainMenu.userSelectionProductID;


public class InventoryService extends InventoryRepository {


	public static void addProduct(Product product) throws IOException {
		if (products.containsKey(String.valueOf(product.getProductID()))) {
			System.out.println("The product exists already");
		} else {
			InventoryRepository.add(product);
			products.put(String.valueOf(product.getProductID()), product);
		}
	}

	public static void updateProduct() throws IOException {


	}

	public static void deleteProduct() throws IOException {
		InventoryRepository.delete(userSelectionProductID, products.get(String.valueOf(userSelectionProductID)));

		if (products.isEmpty()) {
			System.out.println("No products to display");
			return;
		}
	}

	public static void displayAll() throws IOException {
		ArrayList<Product> products = deserializeProduct();

		if (products.isEmpty()) {
			System.out.println("No products to display");
			return;
		}

		System.out.println("===== Inventory List =====");
		System.out.println("ID | Name | Quantity | Price");
		System.out.println("-----------------------------------------");

		for (Product product : products) {
			System.out.printf("%d | %s | %d | $%.2f%n",
					product.getProductID(),
					product.getProductName(),
					product.getProductQuantity(),
					product.getProductPrice());
		}
	}


	public static void loadInventory() throws IOException {
		ArrayList<Product> productList = deserializeProduct();
		if (productList.isEmpty()) {
			System.out.println("No products exist to load");
		} else {
			InventoryRepository.load();
		}
	}

	public static void searchProduct(int userSelectionProductID) throws IOException {
		ArrayList<Product> productList = deserializeProduct();

		if (productList.isEmpty()) {
			System.out.println("No products exist to search");
		} else {
			InventoryRepository.findByID(userSelectionProductID);
		}
	}
}

