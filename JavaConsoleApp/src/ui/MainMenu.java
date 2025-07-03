package ui;

import objects.ConsoleUI;
import service.InventoryService;

public class MainMenu {

	public static void main(String[] args) {


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
					//TODO: InventoryService.ViewProduct()
					break;
				case 3:
					//TODO: InventoryService.SearchProduct()
					break;
				case 4:
					InventoryService.updateProduct();
					break;
				case 5:
					InventoryService.deleteProduct();
					break;
				case 6:
					//TODO: InventoryService.SaveInventory()
					break;
				case 7:
					//TODO: InventoryService.LoadInventory()
					break;
				case 8:
					System.exit(0);
			}
		}
	}
}
