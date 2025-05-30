import java.util.Scanner;

public class ConsoleLesson
{
	public static void main(String[] args) {
		// scanner - specifiy the class of the variable we are initaiting
		// console - just a variable name, how we will reference this object in our code
		// =  - assignment operator
		// new - keyword that creates the object in memory
		// Scanner(System.in) - a constructor that tells java how to create the Scanner object
		// System.in - parameter to specify that we are wanting out scanner to work with command line input
		Scanner console = new Scanner(System.in);

		System.out.println("enter your name: ");
		String userInput = "";

		System.out.println("enter your fav number:");
		userInput = console.nextLine();
		int favoriteNumber = Integer.parseInt(userInput);


		// parsing using wrapper classes
//		Integer.praseInt()
//		Long.parseLong()
//		Double.parseDouble()
//		Boolean.parseBoolean()


	}
}
