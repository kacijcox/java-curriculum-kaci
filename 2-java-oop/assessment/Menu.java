import java.util.Map;
import java.util.Scanner;
import objects.ConsoleUI;

//in this class i referenced my composition/list/adventure exercise for my menu/switches and
// imported the consoleUI from the consoleUI exercise

public class Menu {
	static Scanner scanner = new Scanner(System.in);

	public static Integer getInt(String prompt) {
		System.out.print(prompt);
		return Integer.valueOf(scanner.nextLine());
	}

	public static void main(String[] args) {
		while (true) {
			System.out.println("~~~welcome to food store~~~\n");
			System.out.println("1. display cart \n");
			System.out.println("2. remove item \n");
			System.out.println("3. add item \n");
			System.out.println("4. add discount \n");
			System.out.println("5. checkout \n");
			System.out.println("6. exit \n");

			int selectedChoice = objects.ConsoleUI.getInt("enter selection: \n");
			switch (selectedChoice) {
				case 3:
					System.out.println("select an item by ID to add to your cart: \n");
//					Items.printItems();
			}
		}
	}
}
