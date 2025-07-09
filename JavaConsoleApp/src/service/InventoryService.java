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
import java.nio.file.Paths;
import java.util.ArrayList;
import static model.Product.products;
import static ui.MainMenu.userSelectionProductID;


public class InventoryService extends InventoryRepository {
	static final Path productFile = Paths.get("/home/kaci/IdeaProjects/java-curriculum/java-curriculum-kaci/JavaConsoleApp/inventory.csv");


	public static void addProduct(Product product) throws IOException {
		try {
			products.containsKey(String.valueOf(product.getProductID()));

			if (!products.containsKey(String.valueOf(product.getProductID()))) {
				InventoryRepository.add(product);
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public static ArrayList<Product> deserializeProduct(BufferedReader reader) throws IOException {
		try {
			ArrayList<Product> productList = InventoryRepository.deserialize(reader);
			return productList;
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public static void deleteProduct() throws IOException {
		try {
			InventoryRepository.delete(userSelectionProductID, products.get(String.valueOf(userSelectionProductID)));

			if (products.isEmpty()) {
				System.out.println("No products to display");
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public static void displayAll() throws IOException {
		if (products.isEmpty()) {
			System.out.println("No products to display");
		}
		InventoryRepository.display();
	}

	public static void findByID(int userSelectionProductID) throws IOException {
		try {
			if (products.isEmpty()) {
				System.out.println("No products to display");
			}
			InventoryRepository.find(userSelectionProductID);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public static void searchProduct(int userSelectionProductID) throws IOException {
		Path inventoryFile = Path.of("/home/kaci/IdeaProjects/java-curriculum/java-curriculum-kaci/JavaConsoleApp/inventory.csv");

		try (BufferedReader reader = Files.newBufferedReader(inventoryFile)) {
			ArrayList<Product> productList = deserializeProduct(reader);

			if (productList.isEmpty()) {
				System.out.println("No products exist to search");
			} else {
				findByID(userSelectionProductID);
			}
		}
	}

	public static void saveProduct() throws IOException {
		try {
			if (products.isEmpty()) {
				System.out.println("There is nothing to save");
			} else {
				InventoryRepository.save();
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public static void loadProduct() throws IOException {
		try {
			if (products.isEmpty()) {
				System.out.println("There is nothing to load");
			} else {
				InventoryRepository.load();
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}


	public static void updateProduct(Product product, int userSelectionProductID) throws IOException {
		try {
			if (products.isEmpty()) {
				System.out.println("Product not found");
			}
			else {
				InventoryRepository.update(product, userSelectionProductID);
			}
		}
		catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
