//business logic
//user interaction
//repo calls
package service;

import data.InventoryRepository;
import errorhandling.HandleError;
import model.Product;
import java.io.IOException;
import java.util.ArrayList;

import static model.Product.products;

public class InventoryService {
	private final InventoryRepository inventoryRepository;
	private final HandleError handleError;
	private int userSelectionID;


	public InventoryService(InventoryRepository inventoryRepository) {
		this.inventoryRepository = inventoryRepository;
		this.handleError = new HandleError();
	}

	public void addProduct(Product product) throws IOException {
		try {
			handleError.handleEmptyError(product);
			inventoryRepository.add(product);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage() + "\n");
		}
		catch (IOException e) {
			throw new RuntimeException("Error Adding Product To Inventory", e);
		}
	}


	public ArrayList<Product> deserializeProduct() throws IOException {
		try {
			return inventoryRepository.deserialize();
		} catch (IOException e) {
			System.out.println("Invalid Input\n");
		}
		return null;
	}

	public void deleteProduct() throws IOException {
		try {
			if (products.isEmpty()) {
				System.out.println("No Products To Delete\n");
			} else {
				inventoryRepository.delete(userSelectionID);
			}
		} catch (NumberFormatException e) {
			System.out.println("Invalid number\n");
		}
	}

	public void displayAll() throws IOException {
		try {
			if (products.isEmpty()) {
				System.out.println("No Products To Display\n");
			} else {
				inventoryRepository.display();
			}
		} catch (NumberFormatException e) {
			System.out.println("Invalid Selection\n");
		}
	}

	public int searchProduct(int userSelectionProductID) throws IOException {
		try {
			ArrayList<Product> productList = deserializeProduct();

			if (productList.isEmpty()) {
				System.out.println("No Products Exist To Search\n");
			} else {
				inventoryRepository.find(userSelectionProductID);
			}
		} catch (NumberFormatException e) {
			System.out.println("Invalid Number Or Product Does Not Exist\n");
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
				System.out.println("Product Not Found\n");
			} else {
				inventoryRepository.update(product, userSelectionProductID);
			}
		} catch (NumberFormatException e) {
			System.out.println("Invalid Input Or Product Does Not Exist\n");
		}
	}
}

