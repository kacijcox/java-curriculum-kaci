import java.util.Scanner;
import java.util.Random;


public class JavaSummative {
	private Scanner random;
	String pin = String.format("%04d", random.nextInt(10000));
	private static int[] lockerNumbers = {1, 2, 3};
	private static String[] lockerPins = new String[3];
	private static Scanner scanner = new Scanner(System.in);
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
				accessLocker(args);
				break;
			case 3:
				System.out.println("you chose to release a locker");
				break;
		}
		if (option <= 0) {
			System.exit(0);
		}
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
				System.out.println("assigned locker " + (i + 1));
				System.out.println("your pin is " + lockerPins[i]);
				lockerNumbers[count] = i + 1;
				main(args);

				{
					if (count == 3) {
						System.out.println("no lockers available, returning to main menu");
						main(args);
						break;
					}
				}
			}
		}
	}
//	3. [Feature] Access a Locker
	//● Prompt user for locker number and PIN
	//● Validate input against stored data
	//● Grant access if match is found, else show error

	public static void accessLocker(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter your locker number");
		int accessLocker = Integer.parseInt(scanner.nextLine());
		System.out.println("enter your pin");
		int accessPin = Integer.parseInt(scanner.nextLine());


		for (int i = 0; i < lockerPins.length; i++) {
			if (lockerPins[i].equals(String.valueOf(accessPin)) && lockerNumbers[i] == accessLocker) {
				System.out.println("access granted. returning to main menu");
				//System.out.println( lockerPins[i] + accessPin);
				main(args);
			}
			else {
				System.out.println("access denied. returning to main menu");
				//System.out.println(lockerPins[i] + accessPin);
				main(args);
				break;
			}
		}
	}
}






