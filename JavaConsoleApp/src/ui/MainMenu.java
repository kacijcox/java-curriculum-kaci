package ui;
import objects.ConsoleUI;
import service.InventoryService;
import java.io.IOException;

public class MainMenu {

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
					InventoryService.addProduct();
					break;
				case 2:
					InventoryService.displayAllProducts();
					break;
				case 3:
					//TODO: InventoryService.SearchProduct()
					break;
				case 4:
					//TODO: InventoryService.updateProduct();
					break;
				case 5:
					InventoryService.deleteProduct();
					break;
				case 6:
					//TODO: InventoryService.SaveInventory()
					break;
				case 7:
					InventoryService.loadFromFile();
					break;
				case 8:
					System.exit(0);
			}
		}
	}
}
