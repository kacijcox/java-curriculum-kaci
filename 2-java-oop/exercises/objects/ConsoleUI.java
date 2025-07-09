package objects;

import java.util.Scanner;

public class ConsoleUI {
	public static Scanner scanner = new Scanner(System.in);

	public static String getString(String prompt) {
		System.out.print(prompt);
		return scanner.nextLine();
	}

	public static int getInt(String prompt) {
		while (true) {
			try {
				System.out.print(prompt);
				return Integer.parseInt(scanner.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Enter a valid number");
			}
		}
	}

	public static double getDouble(String prompt) {
		while (true) {
			try {
				System.out.print(prompt);
				return Double.parseDouble(scanner.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Enter valid number");
			}
		}
	}

	public static boolean getBoolean(String prompt) {
		if (scanner.nextLine().toLowerCase().startsWith("y")) {
			return true;
		} else {
			return false;
		}
	}

	public static int scanner(String s) {
		return 0;
	}
}