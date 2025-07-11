package ui;
import java.io.IOException;

import static ui.MenuUserInput.*;

public class MainMenu {
	private MenuUserInput menuUserInput;
	private MenuChoice menuChoice;

	public MainMenu() {
		//have to create an INSTANCE of MenuUserInput to call on it's methods
		this.menuUserInput = new MenuUserInput();
		this.menuChoice = new MenuChoice();
	}

	public static void main(String[] args) throws IOException {
		MainMenu mainMenu = new MainMenu();
		mainMenu.runMenu();
	}

	public void runMenu() throws IOException {
		while (true) {
			MenuChoice.displayMenu();
			int selectedChoice = menuChoice.getUserChoice();

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
					System.exit(0);
			}
		}
	}
}
