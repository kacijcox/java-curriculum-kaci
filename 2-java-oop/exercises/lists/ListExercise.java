package lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Scanner;

public class ListExercise {

	static MenuItem burger = new MenuItem(1, "burger", 1);
	static MenuItem fries = new MenuItem(2, "fries", 2);
	static MenuItem coke = new MenuItem(3, "coke", 3);
	static MenuItem shake = new MenuItem(4, "shake", 4);

	static OrderManager orderManager = new OrderManager(0, new ArrayList<MenuItem>(),
			new Stack<MenuItem>(), new Stack<MenuItem>(), new LinkedList<String>());

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		MenuItem selectedItem = null;

		System.out.println("welcome to the menu");
		System.out.println("please choose an option below: \n");
		System.out.println("[A]DD ITEM TO ORDER\n" +
				"[D]ELETE ITEM FROM ORDER\n" +
				"[U]NDO\n" +
				"[R]EDO\n" +
				"[C]ONFIRM ORDER");

		String choice = scanner.nextLine().toUpperCase();

		switch (choice) {
			case "A":
				System.out.println("select item: 1-burger, 2-fries, 3-coke, 4-shake");
				int itemChoice = scanner.nextInt();

				switch (itemChoice) {
					case 1:
						selectedItem = burger;
						break;
					case 2:
						selectedItem = fries;
						break;
					case 3:
						selectedItem = coke;
						break;
					case 4:
						selectedItem = shake;
						break;
					default:
						System.out.println("invalid choice");
						return;
				}

				orderManager.addToOrder(selectedItem);
				System.out.println("order# " + orderManager.getCurrentOrderNumber());
				System.out.println("added: " + selectedItem.getItemName());
				break;

			case "D":
				System.out.println("current order:");
				for (MenuItem item : orderManager.getCurrentOrder()) {
					System.out.println(item.getItemName());
				}
				break;

			case "U":
				orderManager.undo();
				break;

			case "R":
				orderManager.redo();
				break;

			case "C":
				orderManager.returnOrder();
				System.out.println("order sent to kitchen");
				break;

			default:
				System.out.println("invalid choice");
		}
	}
}
