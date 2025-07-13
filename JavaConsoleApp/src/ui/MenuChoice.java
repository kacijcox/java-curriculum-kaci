package ui;

import objects.ConsoleUI;

public class MenuChoice {

	public static void displayMenu() {
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
	}

	public int getUserChoice() {
		return ConsoleUI.getInt("Enter Your Choice: \n");
	}
}
