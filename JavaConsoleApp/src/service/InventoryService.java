package service;
import objects.ConsoleUI;

public class InventoryService {
	//business logic
	//user interaction
	//repo calls

		public static void addProduct() {
			System.out.println("Create New Product");
			int productID = ConsoleUI.getInt("Enter Product ID: ");
			int productName = ConsoleUI.getInt("Enter Product Name: : ");
			int productPrice = ConsoleUI.getInt("Enter Product Price: : ");
			System.out.println("Product Added Successfully");
			//TODO: InventoryRepository.serializeProduct(productID)
			//TODO: return the Menu()
		}

		public static void updateProduct() {
			//TODO: displayProductInfo()
			System.out.println("Update Product");
			int productID = ConsoleUI.getInt("Enter Product ID: ");
			System.out.println("Current Details: ");
			//IF ID exists then
			//TODO: InventoryRepository.deserializeProduct(productID)
			//else "product does not exist"
			//TODO: return the Menu()
			//--- current details display ---
			int quantity = ConsoleUI.scanner("Enter new quantity (press enter to skip)");
			//APPEND productID.quantity
			int price = ConsoleUI.scanner("Enter new price (press enter to skip)");
			//APPEND productID.price
			//TODO: InventoryRepository.serializeProduct(productID)
			System.out.println("Product successfully updated");
			int returnMenu = ConsoleUI.scanner("Press enter to return to the main menu");
			//TODO: any key returns the Menu()
		}
	}

