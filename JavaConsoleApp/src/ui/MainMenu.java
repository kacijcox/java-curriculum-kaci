package ui;
import data.InventoryRepository;
import service.InventoryService;

import javax.swing.*;
import java.io.IOException;

public class MainMenu {
	private final MenuUserInput menuUserInput;
	private final MenuChoice menuChoice;

	public MainMenu() {
		InventoryRepository inventoryRepository = new InventoryRepository();
		InventoryService inventoryService = new InventoryService(inventoryRepository);
		this.menuUserInput = new MenuUserInput(inventoryService);
		this.menuChoice = new MenuChoice();
	}

	public static void main(String[] args) throws IOException {
		MainMenu mainMenu = new MainMenu();
		mainMenu.runMenu();
	}

	public void runMenu() throws IOException {
		while (true) {
			String[] options = {
					"1. Add Product",
					"2. View Products",
					"3. Search Product",
					"4. Update Product",
					"5. Delete Product",
					"6. Save Inventory to File",
					"7. Load Inventory from File",
					"8. Exit"
			};
			String selectedOption = (String) JOptionPane.showInputDialog(
					null,
					"Select Option: ",
					"Inventory Menu",
					JOptionPane.QUESTION_MESSAGE,
					null,
					options,
					options[0]
			);

			if (selectedOption == null) {
				JOptionPane.showMessageDialog(null, "No Option Selected");
				System.exit(0);
			}

			int selectedChoice = Integer.parseInt(selectedOption.substring(0, 1));

			switch (selectedChoice) {
				case 1:
					menuUserInput.caseOne();
					break;
				case 2:
					menuUserInput.caseTwo();
					break;
				case 3:
					menuUserInput.caseThree();
					break;
				case 4:
					menuUserInput.caseFour();
					break;
				case 5:
					menuUserInput.caseFive();
					break;
				case 6:
					menuUserInput.caseSix();
					break;
				case 7:
					menuUserInput.caseSeven();
					break;
				case 8:
					JOptionPane.showMessageDialog(null, "Bye");
					System.exit(0);
				default:
					JOptionPane.showMessageDialog(null, "Invalid");
			}
		}
	}
}
