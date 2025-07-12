package ui;
import data.InventoryRepository;
import model.Product;
import objects.ConsoleUI;
import service.InventoryService;
import java.io.IOException;

public class MenuUserInput {

	private String newProductName;
	private double newProductPrice;
	private int newProductQuantity;
	private boolean newIsPerishable;
	private int newProductID;
	private int userSelectionProductID;
	private int selectedChoice;
	private InventoryService inventoryService;

	public MenuUserInput(InventoryService inventoryService) {
		this.inventoryService = inventoryService;
	}

	public void userSelectionProductIDInput() {
		this.userSelectionProductID = ConsoleUI.getInt("Enter Product ID: ");
	}

	public void newProductIDInput() {
		this.newProductID = ConsoleUI.getInt("Enter New Product ID: ");
	}

	public void newProductNameInput() {
		this.newProductName = ConsoleUI.getString("Enter New Product Name: ");
	}

	public void newProductPriceInput() {
		this.newProductPrice = ConsoleUI.getDouble("Enter New Product Price: ");
	}

	public void newProductQuantityInput() {
		this.newProductQuantity = ConsoleUI.getInt("Enter New Product Quantity: ");
	}

	public void newIsPerishableInput () {
		this.newIsPerishable = Boolean.parseBoolean(ConsoleUI.getString("Is The Product Perishable? (true/false): "));
	}

	public void caseOne() throws IOException {
		System.out.println("Create New Product");
		newProductIDInput();
		newProductNameInput();
		newProductPriceInput();
		newProductQuantityInput();
		newIsPerishableInput();

		Product newProduct = new Product();

		inventoryService.addProduct(newProduct);
		System.out.println("Product Added Successfully\n");
	}

	public void caseTwo() throws IOException {
		System.out.println("View Products: ");
		inventoryService.displayAll();
	}

	public void caseThree() throws IOException {
		userSelectionProductIDInput();
		inventoryService.searchProduct(userSelectionProductID);
	}

	public void caseFour() throws IOException {
		newProductIDInput();
		newProductNameInput();
		newProductPriceInput();
		newProductQuantityInput();
		newIsPerishableInput();

		Product updatedProduct = new Product();
		updatedProduct.setAllProduct(
			newProductID,
			newProductQuantity,
			newProductName,
			newProductPrice,
			newIsPerishable
		);
		inventoryService.updateProduct(updatedProduct, userSelectionProductID);
	}

	public void caseFive() throws IOException {
		inventoryService.displayAll();
		System.out.println("Delete Product");
		userSelectionProductIDInput();
		inventoryService.deleteProduct();
		System.out.println("Item Successfully Deleted\n");
		inventoryService.displayAll();
	}

	public void caseSix() throws IOException {
		inventoryService.saveProduct(); //product has to be saved before update and search can execute
		System.out.println("Current Inventory Saved To File\n");
	}

	public void caseSeven() throws IOException {
		inventoryService.loadProduct();
	}

	public void caseEight() throws IOException {
		System.out.println("Exiting Application");
		System.exit(0);
	}

	public void selectedChoice() {
		selectedChoice = ConsoleUI.getInt("Enter Selection: \n");
	}

	public String getNewProductName() { return newProductName; }
	public void setNewProductName(String newProductName) { this.newProductName = newProductName; }

	public double getNewProductPrice() { return newProductPrice; }
	public void setNewProductPrice(double newProductPrice) { this.newProductPrice = newProductPrice; }

	public int getNewProductID() { return newProductID; }
	public void setNewProductID(int newProductID) { this.newProductID = newProductID; }

	public boolean isNewIsPerishable() { return newIsPerishable; }
	public void setNewIsPerishable(boolean newIsPerishable) { this.newIsPerishable = newIsPerishable; }

	public int getNewProductQuantity() { return newProductQuantity; }
	public void setNewProductQuantity(int newProductQuantity) { this.newProductQuantity = newProductQuantity; }

	public int getUserSelectionProductID() { return userSelectionProductID; }
	public void setUserSelectionProductID(int userSelectionProductID) { this.userSelectionProductID = userSelectionProductID; }

	public int getSelectedChoice() { return selectedChoice; }
	public void setSelectedChoice(int selectedChoice) { this.selectedChoice = selectedChoice; }
}

