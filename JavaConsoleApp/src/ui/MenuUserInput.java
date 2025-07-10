package ui;
import model.Product;
import objects.ConsoleUI;
import service.InventoryService;

import java.io.IOException;

import static service.InventoryService.displayAll;

public class MenuUserInput {

	public static String newProductName;
	public static double newProductPrice;
	public static int newProductQuantity;
	public static boolean newIsPerishable;
	public static int newProductID;
	public static int userSelectionProductID;
	public static int selectedChoice;




	public static void userSelectionProductIDInput() {
		userSelectionProductID = ConsoleUI.getInt("Enter Product ID: ");
	}

	public static void newProductIDInput() {
		newProductID = ConsoleUI.getInt("Enter New Product ID: ");
	}

	public static void newProductNameInput() {
		newProductName = ConsoleUI.getString("Enter New Product Name: ");
	}

	public static void newProductPriceInput() {
		newProductPrice = ConsoleUI.getDouble("Enter New Product Price: ");
	}

	public static void newProductQuantityInput() {
		newProductQuantity = ConsoleUI.getInt("Enter New Product Quantity: ");
	}

	public static void newIsPerishableInput () {
		newIsPerishable = Boolean.parseBoolean(ConsoleUI.getString("Is The Product Perishable? (true/false): "));
	}

	public static void caseOne() throws IOException {
		System.out.println("Create New Product");
		newProductIDInput();
		newProductNameInput();
		newProductPriceInput();
		newProductQuantityInput();
		newIsPerishableInput();
		Product product = new Product(newProductID, newProductQuantity, newProductName, newProductPrice, newIsPerishable);
		InventoryService.addProduct(product);
		System.out.println("Product Added Successfully\n");
	}

	public static void caseTwo() throws IOException {
		InventoryService.displayAll();
	}

	public static void caseThree() throws IOException {
		userSelectionProductIDInput();
		InventoryService.searchProduct(userSelectionProductID);
	}

	public static void caseFour() throws IOException {
		newProductIDInput();
		newProductNameInput();
		newProductPriceInput();
		newProductQuantityInput();
		newIsPerishableInput();
		Product updatedProduct = new Product(userSelectionProductID, newProductQuantity, newProductName, newProductPrice, newIsPerishable);
		InventoryService.updateProduct(updatedProduct, userSelectionProductID);
	}

	public static void caseFive() throws IOException {
		displayAll();
		System.out.println("Delete Product");
		userSelectionProductIDInput();
		InventoryService.deleteProduct();
		System.out.println("Item Successfully Deleted\n");
		displayAll();
	}

	public static void caseSix() throws IOException {
		InventoryService.saveProduct(); //product has to be saved before update and search can execute
		System.out.println("Current Inventory Saved To File\n");
	}

	public static void caseSeven() throws IOException {
		InventoryService.loadProduct();
	}

	public static void caseEight() throws IOException {
		System.out.println("Exiting Application");
		System.exit(0);
	}

	public static void selectedChoice() {
		selectedChoice = ConsoleUI.getInt("Enter Selection: \n");
	}
}

