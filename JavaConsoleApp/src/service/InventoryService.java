//business logic
//user interaction
//repo calls
package service;

import data.InventoryRepository;
import model.Product;
import ui.MenuUserInput;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

import static model.Product.products;

public class InventoryService {
	private final InventoryRepository inventoryRepository;
	private MenuUserInput menuUserInput;


	public InventoryService(InventoryRepository inventoryRepository) {
		this.inventoryRepository = inventoryRepository;
		this.menuUserInput = menuUserInput;
	}

	public void addProduct(Product product) throws IOException {
		try {
			products.containsKey(String.valueOf(product.getProductID()));

			if (!products.containsKey(String.valueOf(product.getProductID()))) {
				inventoryRepository.add(product);
			}
		} catch (IOException e) {
			System.out.println("Invalid Input");
		}
	}

	public ArrayList<Product> deserializeProduct() throws IOException {
		try {
			ArrayList<Product> productList = inventoryRepository.deserialize();
			return productList;
		} catch (IOException e) {
			System.out.println("Invalid Input");
		}
		return null;
	}

	public void deleteProduct() throws IOException {
		try {
			if (products.isEmpty()) {
				System.out.println("No Products To Delete");
			} else {
				menuUserInput.userSelectionProductIDInput();
				inventoryRepository.delete(menuUserInput.getUserSelectionProductID());
			}
		} catch (NumberFormatException e) {
			System.out.println("Invalid number");
		}
	}

	public void displayAll() throws IOException {
		try {
			if (products.isEmpty()) {
				System.out.println("No Products To Display");
			} else {
				inventoryRepository.display();
			}
		} catch (NumberFormatException e) {
			System.out.println("Invalid Selection");
		}
	}

	public int findByID(int userSelectionProductID) throws IOException {
		Path savedFile = Path.of("/home/kaci/IdeaProjects/java-curriculum/java-curriculum-kaci/JavaConsoleApp/inventory.csv");
		try {
			BufferedReader reader = Files.newBufferedReader(savedFile);
			inventoryRepository.find(userSelectionProductID);
		} catch (NumberFormatException e) {
			System.out.println("Invalid Number Or Product Does Not Exist");
		}
		return userSelectionProductID;
	}

	public int searchProduct(int userSelectionProductID) throws IOException {
		Path inventoryFile = Path.of("/home/kaci/IdeaProjects/java-curriculum/java-curriculum-kaci/JavaConsoleApp/inventory.csv");
		try {
			BufferedReader reader = Files.newBufferedReader(inventoryFile);
			ArrayList<Product> productList = deserializeProduct();
			if (productList.isEmpty()) {
				System.out.println("No Products Exist To Search");
			} else {
				inventoryRepository.search(userSelectionProductID);
			}
		} catch (NumberFormatException e) {
			System.out.println("Invalid Number Or Product Does Not Exist");
		}
		return userSelectionProductID;
	}

	public void saveProduct() throws IOException {
		try {
			if (products.isEmpty()) {
				System.out.println("There Is Nothing To Save");
			} else {
				inventoryRepository.save();
			}
		} catch (NumberFormatException e) {
			System.out.println("Invalid Selection");
		}
	}

	public void loadProduct() throws IOException {

		try {
			if (products.isEmpty()) {
				System.out.println("There Is Nothing To Load");
			} else {
				inventoryRepository.load();
			}
		} catch (IOException e) {
			System.out.println("Invalid Input");
		}
	}

	public void updateProduct(Product product, int userSelectionProductID) throws IOException {
		try {
			if (products.isEmpty()) {
				System.out.println("Product Not Found");
			} else {
				inventoryRepository.update(product, userSelectionProductID);
			}
		} catch (NumberFormatException e) {
			System.out.println("Invalid Input Or Product Does Not Exist");
		}
	}
}
