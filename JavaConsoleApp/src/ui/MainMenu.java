package ui;
import model.Product;
import objects.ConsoleUI;
import service.InventoryService;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
			int selectedChoice = ConsoleUI.getInt("Enter Selection: \n");
			switch (selectedChoice) {
				case 1:
					System.out.println("Create New Product");
					int productID = ConsoleUI.getInt("Enter Product ID: ");
					String productName = String.valueOf(ConsoleUI.getString("Enter Product Name: "));
					double productPrice = ConsoleUI.getDouble("Enter Product Price: ");
					int productQuantity = ConsoleUI.getInt("Enter Product Quantity: ");
					boolean isPerishable = Boolean.parseBoolean(ConsoleUI.getString("Is The Product Perishable? (true/false): "));
					Product product = new Product(productID, productQuantity, productName, productPrice, isPerishable);
					InventoryService.addProduct(product);
					System.out.println("Product Added Successfully\n");
					break;
				case 2:
					displayAll();
					break;
				case 3:
					userSelectionProductID = ConsoleUI.getInt("Enter Product ID: ");
					InventoryService.searchProduct(userSelectionProductID, new BufferedReader(new InputStreamReader(System.in)));
					break;
				case 4:
					userSelectionProductID = ConsoleUI.getInt("Enter New Product ID: ");
					productName = ConsoleUI.getString("Enter New Product Name: ");
					productPrice = ConsoleUI.getDouble("Enter New Product Price: ");
					productQuantity = ConsoleUI.getInt("Enter New Product Quantity: ");
					isPerishable = Boolean.parseBoolean(ConsoleUI.getString("Is The Product Perishable? (true/false): "));
					Product updatedProduct = new Product(userSelectionProductID, productQuantity, productName, productPrice, isPerishable);
					InventoryService.updateProduct(updatedProduct, userSelectionProductID);
					break;
				case 5:
					displayAll();
					System.out.println("Delete Product");
					userSelectionProductID = ConsoleUI.getInt("Enter Product ID: ");
					InventoryService.deleteProduct();
					System.out.println("Item Successfully Deleted\n");
					displayAll();
					break;
				case 6:
					InventoryService.saveProduct();
					System.out.println("Current Inventory Saved To File\n");
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
