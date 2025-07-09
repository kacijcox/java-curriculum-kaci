package ui;
import model.Product;
import objects.ConsoleUI;
import service.InventoryService;
import java.io.IOException;

import static service.InventoryService.displayAll;

public class MainMenu {
	public static int userSelectionProductID;


	public static void main(String[] args) throws IOException {


		while (true) {
			System.out.println(
					"===== Inventory Manager =====\n" +
							"1. Add Product\n" +
							"2. View Products\n" +
							"3. Search Product\n" +
							"4. Update Product\n" +
							"5. Delete Product\n" +
							"6. Save Inventory to File\n" +
							"7. Load Inventory from File\n" +
							"8. Exit");
			int selectedChoice = ConsoleUI.getInt("enter selection: \n");
			switch (selectedChoice) {
				case 1:
					System.out.println("Create New Product");
					int productID = ConsoleUI.getInt("Enter Product ID: ");
					String productName = String.valueOf(ConsoleUI.getString("Enter Product Name: "));
					double productPrice = ConsoleUI.getDouble("Enter Product Price: ");
					int productQuantity = ConsoleUI.getInt("Enter Product Quantity: ");
					Product product = new Product(productID, productQuantity, productName, productPrice);
					InventoryService.addProduct(product);
					System.out.println("Product Added Successfully");
					break;
				case 2:
					displayAll();
					break;
				case 3:
					userSelectionProductID = ConsoleUI.getInt("Enter Product ID: ");
					InventoryService.searchProduct(userSelectionProductID);
					break;
				case 4:
					displayAll();
					System.out.println("Update Product");
					int updateProductID = ConsoleUI.getInt("Enter Product ID: ");
					System.out.println("Current Details: ");
					//		InventoryRepository.deserializeProduct(Product.products.get(String.valueOf(updateProductID)))
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
					break;
				case 5:
					displayAll();
					System.out.println("Delete Product");
					userSelectionProductID = ConsoleUI.getInt("Enter Product ID: ");
					InventoryService.deleteProduct();
					System.out.println("Item successfully deleted");
					displayAll();
					break;
				case 6:
					InventoryService.saveProduct();
					break;
				case 7:
					InventoryService.loadProduct();
					break;
				case 8:
					System.exit(0);
			}
		}
	}
}
