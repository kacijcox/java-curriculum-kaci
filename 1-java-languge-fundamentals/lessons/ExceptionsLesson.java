import java.util.Scanner;

public class ExceptionsLesson {

	public static void main(String[] args) {
		// excetions
		// runtime or unchecked exceptions vs checked exceptions
		// runtime checked exception - these are exceptions that java will force you to handle
		//						example: file handling, interacting, networking
		// unchecked exceptions - these are exceptions that java will let you throw (possible coding issue)
		//						examples: divide by zero, parsing error, null pointer exception

		Scanner console = new Scanner(System.in);
		String userInput = "";

//		// example of a simple try/catch
//		try {
//			System.out.println("please enter a number: ");
//			userInput = console.nextLine();
//			int number = Integer.parseInt(userInput);
//			System.out.println("the number you entered times 5 is: " + number * 5);
//
//		} catch (NumberFormatException e) { // must specify the exception we are catching and give a name ( usually e )
//			System.out.println("you didn't enter a number");
//		}
//	}

		// example of a try with multiple catches
		// example of a finally block that will be executed no matter what
//		try {
//			System.out.println("please enter a number: ");
//			userInput = console.nextLine();
//			int number = Integer.parseInt(userInput);
//			System.out.println("5 divided by the number you entered: " + 5 / number);
//
//		} catch (NumberFormatException e) {
//			System.out.println("you didn't enter a number");
//		} catch (ArithmeticException e) { // we can catch multiple exceptions
//			System.out.println("cannot divide by zero");
//		} catch (Exception e) {
//			System.out.println("something went wrong");
//		} finally {
//			System.out.println("program finsihed");
//		}
//
		double userDouble = 0.0;
		try {
			userDouble = userDouble = getUserDouble("enter a decimal");
		} catch(NumberFormatException e) {
			System.out.println("decimal point" + userDouble);

		}
	}

	public static int getUserInt(String prompt) {
		Scanner console = new Scanner(System.in);
		int number = 0;

		System.out.println(prompt);
		while (true) {
			try {
				number = Integer.parseInt(console.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("please enter a number");

			}
		}
		return number;
	}

	// throwing an exception means that whoever is calling this method will have to deal with it
	public static double getUserDouble(String prompt) throws NumberFormatException {
		Scanner console = new Scanner(System.in);

		System.out.println(prompt);
		return Double.parseDouble(console.nextLine());
	}
}