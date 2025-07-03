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
				System.out.println("enter a valid number");
			}
		}
	}

	public static double getDouble(String prompt) {
		while (true) {
			try {
				System.out.print(prompt);
				return Double.parseDouble(scanner.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("enter valid number");
			}
		}
	}

	public static boolean getBoolean(String prompt) {
		while (true) {
			System.out.print(prompt + " (y/n): ");
			String input = scanner.nextLine().toLowerCase();
			if (input.equals("y") || input.equals("yes")) {
				return true;
			} else if (input.equals("n") || input.equals("no")) {
				return false;
			} else {
				System.out.println("enter y/n");
			}
		}
	}

	public static int scanner(String s) {
	}
}