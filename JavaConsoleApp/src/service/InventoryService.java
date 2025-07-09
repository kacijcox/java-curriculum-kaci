//business logic
//user interaction
//repo calls

package service;
import data.InventoryRepository;
import model.Product;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
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
		}
	}

	public static void displayAll() throws IOException {
		System.out.println(products);
	}

	public static void searchProduct(int userSelectionProductID) throws IOException {
		Path inventoryFile = Path.of("/home/kaci/IdeaProjects/java-curriculum/java-curriculum-kaci/JavaConsoleApp/inventory.csv");

		try (BufferedReader reader = Files.newBufferedReader(inventoryFile)) {
			ArrayList<Product> productList = deserializeProduct(reader);

			if (productList.isEmpty()) {
				System.out.println("No products exist to search");
			} else {
				InventoryRepository.findByID(userSelectionProductID);
			}
		}
	}

	public static void saveProduct() throws IOException {
		if (products.isEmpty()) {
			System.out.println("There is nothing to save");
		} else {
			InventoryRepository.save();
		}
	}

	public static void loadProduct() throws IOException {
		if (products.isEmpty()) {
			System.out.println("There is nothing to load");
		} else {
			InventoryRepository.load();
		}
	}
}
