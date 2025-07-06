package service;
import data.InventoryRepository;
import model.Product;
import objects.ConsoleUI;
import java.io.IOException;



public class InventoryService extends InventoryRepository {

	//business logic
	//user interaction
	//repo calls

	public static void addProduct() throws IOException {
		System.out.println("Create New Product");
		int productID = ConsoleUI.getInt("Enter Product ID: ");
		String productName = String.valueOf(ConsoleUI.getString("Enter Product Name: "));
		double productPrice = ConsoleUI.getDouble("Enter Product Price: ");
		int productQuantity = ConsoleUI.getInt("Enter Product Quantity: ");
		Product product = new Product(productID, productQuantity, productName, productPrice);
		InventoryRepository.add(product);
		System.out.println("Product Added Successfully");
	}

	public static void updateProduct() {
		//TODO: displayProductInfo()
		System.out.println("Update Product");
		int productID = ConsoleUI.getInt("Enter Product ID: ");
		System.out.println("Current Details: ");
		//TODO: IF ID exists then
		//TODO: InventoryRepository.deserializeProduct(productID)
		//TODO: else "product does not exist"
		//TODO: return the Menu()
		//--- current details display ---
		int quantity = ConsoleUI.scanner("Enter new quantity (press enter to skip)");
		int price = ConsoleUI.scanner("Enter new price (press enter to skip)");
		//TODO: APPEND productID.price
		//TODO: InventoryRepository.serializeProduct(productID)
		// StandardOpenOption.APPEND
		System.out.println("Product successfully updated");
		int returnMenu = ConsoleUI.scanner("Press enter to return to the main menu");
		//TODO: any key returns the Menu()
	}

	public static void deleteProduct() {
		//TODO: displayProductInfo()
		System.out.println("Delete Product");
		int productID = ConsoleUI.getInt("Enter Product ID: ");
		String confirmDeletion = ConsoleUI.getString("Are you sure you want to delete this product? (Y/N) ");
		//TODO: IF confirmDeletion.equals Y
		// then InventoryRepository.deserializeProduct(productID)
		// StandardOpenOption.DELETE
		//TODO: InventoryRepository.serializeProduct(productID)
	}

	public static void displayAllProducts() {
		InventoryRepository.displayAll();
	}
}


