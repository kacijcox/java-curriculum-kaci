import java.util.Scanner;
import java.util.Random;


public class JavaSummative {
	private Scanner random;
	private static int[] lockerNumbers = new int[10];
	private static String[] lockerPins = new String[10];
	private static int count = 0;
	private static Scanner scanner = new Scanner(System.in);


	public static void main(String[] args) {
//		What would you like to do next?
//		1. Rent a Locker
//		2. Access a Locker
//		3. Release a Locker
//				---
//				Any other key to exit.
		System.out.println("what would you like to do next?");
		System.out.println("1. rent a locker");
		System.out.println("2. access a locker");
		System.out.println("3. release a locker");
		System.out.println("------------");
		System.out.println("any other key to exit");

		int option = Integer.parseInt(scanner.nextLine());


		switch (option) {
			case 1:
				System.out.println("you chose to rent a locker");
				rentLocker(args);
				break;
			case 2:
				System.out.println("you chose to access to a locker");
				accessLocker(args);
				break;
			case 3:
				System.out.println("you chose to release a locker");
				releaseLocker(args);
				break;
			default:
				System.exit(0);
		}
		main(args);
	}

	public static boolean lockerAccess(int lockerNumber, int pin) {
		for (int i = 0; i < lockerPins.length; i++) {
			if (lockerPins[i] != null &&
					lockerPins[i].equals(String.valueOf(pin)) && (i + 1) == lockerNumber) {
				return true;
			}
		}
		return false;
	}

//2. [Feature] Rent a Locker
	//● Assign next available locker number
	//● Generate and display a 4-digit PIN (as a String with leading zeros)
	//● Store locker and PIN in array
	//● Remove option if no lockers available

	public static void rentLocker(String[] args) {
		System.out.println("assigning next available locker number...");

		for (int i = 0; i < lockerPins.length; i++) {
			if (lockerPins[i] == null) {
				lockerPins[i] = String.format("%04d", new Random().nextInt(10000));
				lockerNumbers[i] = i + 1;
				System.out.println("assigned locker " + (i + 1));
				System.out.println("your pin is " + lockerPins[i]);
				return;
			}
			if (count == 3) {
				System.out.println("no lockers available, returning to main menu");
				main(args);
				break;
			}
		}
	}

//	3. [Feature] Access a Locker
	//● Prompt user for locker number and PIN
	//● Validate input against stored data
	//● Grant access if match is found, else show error

	public static void accessLocker(String[] args) {
		System.out.println("enter your locker number");
		int accessLocker = Integer.parseInt(scanner.nextLine());

		System.out.println("enter pin");
		int accessPin = Integer.parseInt(scanner.nextLine());

		if (lockerAccess(accessLocker, accessPin)) {
			System.out.println("access granted");
		} else {
			System.out.println("invalid locker number or pin");
		}
		main(args);

	}

//4. [Feature] Release a Locker
	//● Prompt for locker number and PIN
	//● Confirm action: “Are you sure?” (Yes/No)
	//● Clear data from array if confirmed
	//● Show error for incorrect PIN or locker

	public static void releaseLocker(String[] args) {
		System.out.println("enter your locker number");
		int releaseLocker = Integer.parseInt(scanner.nextLine());

		System.out.println("enter your pin");
		int releasePin = Integer.parseInt(scanner.nextLine());

		if (lockerAccess(releaseLocker, releasePin)) {
			lockerPins[releaseLocker - 1] = null;
			System.out.println("the locker has been released");
		} else {
			System.out.println("invalid locker number or pin");
		}
	}
}




