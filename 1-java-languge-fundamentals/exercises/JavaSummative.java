import java.util.Scanner;
import java.util.Random;


public class JavaSummative {
	String pin = String.format("%04d", new Random().nextInt(10000));
	private static int[] lockerNumbers = {1, 2, 3};
	private static String[] lockerPins = new String[3];
	private static Scanner scnaner = new Scanner(System.in);
	private static int count = 0;


	public static void main(String[] args) {
//		What would you like to do next?
//		1. Rent a Locker
//		2. Access a Locker
//		3. Release a Locker
//				---
//				Any other key to exit.
		Scanner scanner = new Scanner(System.in);
		System.out.println("what would you like to do next?");
		System.out.println("1. rent a locker");
		System.out.println("2. access a locker");
		System.out.println("3. release a locker");
		System.out.println("------------");
		System.out.println("any other key to exit");

		int option = scanner.nextInt();


		switch (option) {
			case 1:
				System.out.println("you chose to rent a locker");
				rentLocker(args);
				break;

				case 2:
				System.out.println("you chose to access to a locker");
				break;
			case 3:
				System.out.println("you chose to release a locker");
				break;
		}
		if (option <= 0) {
			System.exit(0);
		}
	}


	public static void rentLocker(String[] args) {
		System.out.println("assigning next available locker number...");
		//assign locker number
		//check that locker is available else return to main menu
		for (int i = 0; i < lockerPins.length; i++) {
			if (lockerPins[i] == null) {
				//assign pin with random
				lockerPins[i] = String.format("%04d", new Random().nextInt(1000));
				// assign locker number by adding to i
				System.out.println("assigned locker " + (i + 1));
				System.out.println("your pin is " + lockerPins[i]);
				count++;
				main(args);
				{
					//if not enough locker numbers then return to main menu
					if (count == 3) {
						System.out.println("no lockers available, returning to main menu");
						main(args);
					}
				}
			}
		}
	}
}




