package ui;
import java.io.IOException;

import static ui.MenuUserInput.*;

public class MainMenu {

	public static void main(String[] args) throws IOException {
		while (true) {
			MenuChoice.menuChoice();
			switch (selectedChoice) {
				case 1:
					MenuUserInput.caseOne();
					break;
				case 2:
					MenuUserInput.caseTwo();
					break;
				case 3:
					MenuUserInput.caseThree();
					break;
				case 4:
					MenuUserInput.caseFour();
					break;
				case 5:
					MenuUserInput.caseFive();
					break;
				case 6:
					MenuUserInput.caseSix();
					break;
				case 7:
					MenuUserInput.caseSeven();
					break;
				case 8:
					System.exit(0);
			}
		}
	}
}
