import java.util.Scanner;


public class JavaSummative {

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
}
