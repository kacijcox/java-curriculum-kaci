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

public class InventoryService {

	public static void addProduct(Product product) throws IOException {
		try {
			products.containsKey(String.valueOf(product.getProductID()));

			if (!products.containsKey(String.valueOf(product.getProductID()))) {
				InventoryRepository.add(product);
			}
		} catch (IOException e) {
			System.out.println("Invalid Input");
			;
		}
	}

	public static ArrayList<Product> deserializeProduct() throws IOException {
		try {
			ArrayList<Product> productList = InventoryRepository.deserialize();
			return productList;
		} catch (IOException e) {
			System.out.println("Invalid Input");
			;
		}
		return null;
	}

	public static void deleteProduct() throws IOException {
		try {
			if (products.isEmpty()) {
				System.out.println("No Products To Delete");
			} else {
				InventoryRepository.delete(null, userSelectionProductID);
			}
		} catch (NumberFormatException e) {
			System.out.println("Invalid number");
			;
		}
	}

	public static void displayAll() throws IOException {
		try {
			if (products.isEmpty()) {
				System.out.println("No Products To Display");
			} else {
				InventoryRepository.display();
			}
		} catch (NumberFormatException e) {
			System.out.println("Invalid Selection");
		}
	}

	public static int findByID(int userSelectionProductID) throws IOException {
		Path savedFile = Path.of("/home/kaci/IdeaProjects/java-curriculum/java-curriculum-kaci/JavaConsoleApp/inventory.csv");
		try {
			BufferedReader reader = Files.newBufferedReader(savedFile);
			InventoryRepository.find(userSelectionProductID);
		} catch (NumberFormatException e) {
			System.out.println("Invalid Number Or Product Does Not Exist");
		}
		return userSelectionProductID;
	}

	public static int searchProduct(int userSelectionProductID) throws IOException {
		Path inventoryFile = Path.of("/home/kaci/IdeaProjects/java-curriculum/java-curriculum-kaci/JavaConsoleApp/inventory.csv");
		try {
			BufferedReader reader = Files.newBufferedReader(inventoryFile);
			ArrayList<Product> productList = deserializeProduct();
			if (productList.isEmpty()) {
				System.out.println("No Products Exist To Search");
			} else {
				InventoryRepository.search(userSelectionProductID);
			}
		} catch (NumberFormatException e) {
			System.out.println("Invalid Number Or Product Does Not Exist");
		}
		return userSelectionProductID;
	}

	public static void saveProduct() throws IOException {
		try {
			if (products.isEmpty()) {
				System.out.println("There Is Nothing To Save");
			} else {
				InventoryRepository.save();
			}
		} catch (NumberFormatException e) {
			System.out.println("Invalid Selection");
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
			} else {
				InventoryRepository.update(product, userSelectionProductID);
			}
		} catch (NumberFormatException e) {
			System.out.println("Invalid Input Or Product Does Not Exist");
		}
	}
}
