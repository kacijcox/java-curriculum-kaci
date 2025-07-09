//business logic
//user interaction
//repo calls

package service;
import data.InventoryRepository;
import model.Product;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.Buffer;
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
			System.out.println("Invalid Input");;
		}
	}

	public static ArrayList<Product> deserializeProduct() throws IOException {
		try {
			ArrayList<Product> productList = InventoryRepository.deserialize();
			return productList;
		} catch (IOException e) {
			System.out.println("Invalid Input");;
		}
		return null;
	}

	public static void deleteProduct() throws IOException {
		try {
			if (products.isEmpty()) {
				System.out.println("No Products To Delete");
			}
			else {
				InventoryRepository.delete(null, userSelectionProductID);
			}
	} catch (IOException e) {
			System.out.println("Invalid Input");;
		}
		}

		public static void displayAll() throws IOException {
		try {
			if (products.isEmpty()) {
				System.out.println("No Products To Display");
			}
			else {
				InventoryRepository.display();
			}
		} catch (IOException e) {
			System.out.println("Invalid Input");
		}
	}

	public static void findByID(int userSelectionProductID) throws IOException {
		Path savedFile = Path.of("/home/kaci/IdeaProjects/java-curriculum/java-curriculum-kaci/JavaConsoleApp/inventory.csv");
		try {
			BufferedReader reader = Files.newBufferedReader(savedFile);
			InventoryRepository.find(userSelectionProductID);
		} catch (Exception e) {
			System.out.println("Invalid Input");
		}
	}

	public static void searchProduct(int userSelectionProductID) throws IOException {
		Path inventoryFile = Path.of("/home/kaci/IdeaProjects/java-curriculum/java-curriculum-kaci/JavaConsoleApp/inventory.csv");

		try {
			BufferedReader reader = Files.newBufferedReader(inventoryFile);
			ArrayList<Product> productList = deserializeProduct();
			if (productList.isEmpty()) {
				System.out.println("No Products Exist To Search");
			} else {
				InventoryRepository.search(userSelectionProductID);
			}
		} catch (IOException e) {
			System.out.println("Invalid Input");
		}
	}

	public static void saveProduct() throws IOException {
		try {
			if (products.isEmpty()) {
				System.out.println("There Is Nothing To Save");
			} else {
				InventoryRepository.save();
			}
		} catch (IOException e) {
			System.out.println("Invalid Input");
		}
	}

	public static void loadProduct() throws IOException {
		try {
			if (products.isEmpty()) {
				System.out.println("There Is Nothing To Load");
			} else {
				InventoryRepository.load();
			}
		} catch (IOException e) {
			System.out.println("Invalid Input");
		}
	}


	public static void updateProduct(Product product, int userSelectionProductID) throws IOException {
		try {
			if (products.isEmpty()) {
				System.out.println("Product Not Found");
			}
			else {
				InventoryRepository.update(product, userSelectionProductID);
			}
		}
		catch (IOException e) {
			System.out.println("Invalid Input");
		}
	}
}
