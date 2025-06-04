import java.util.Scanner;

public class ExceptionExercise {
    /*

        ● If the user enters a valid age, email, and PIN, the program should display
        "Registration Successful!"
        ● If the user enters an invalid age or PIN, the program should display an error
        message and ask them to try again.
        ● If the user enters a null or empty email, the program should notify them.
        ● Regardless of errors, a "Registration Attempt Complete!" message should
        always be printed at the end.
    */
    /*
        Bonus Challenge:
        ● Use a loop to allow the user to retry entering the age or PIN if an error occurs.
        ● Allow only numbers for the PIN and ensure it is exactly 4 digits
     */

	static int age = 0;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.print("Enter your age: ");
			int age = Integer.parseInt(scanner.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("please try again");
		}
		System.out.print("Enter your email: ");
		String email = scanner.nextLine();

		int pin = 0;

		try {
			System.out.print("Enter your 4-digit PIN: ");
			pin = Integer.parseInt(scanner.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("please try again");
		}

		System.out.println("registration attempt complete");

		System.out.println("\nRegistration Successful!");
		System.out.println("Age: " + age);
		System.out.println("Email: " + email);
		System.out.println("PIN: " + pin);
	}
}
