import java.util.Scanner;

public class ConditionalsLesson {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		String userInput = "";

		System.out.println("what is your name?");
		userInput = console.nextLine();
		int age = Integer.parseInt(userInput);
		boolean isValidAge = age > 25;
		System.out.println(isValidAge);

		System.out.println("do you have a valid license (y/n");
		userInput = console.nextLine();

		// when comparing you have to use the .equals with primitive types
		boolean hasLicense = "y".equals(userInput);
		System.out.println(hasLicense);

		// and or not
		// &&  || !
		if (isValidAge && hasLicense){
			System.out.println(" you can rent a car");
		}
	}
}

// switch
int dayOfTheWeek = 7;

void main() {
	// based on a value we can 8immediately execute a set of instructions
	// by defining cases we want to check for
	// keyword switch takes a value of somekind, not a boolean
	switch (dayOfTheWeek) {
		case 1:
			System.out.println("it is monday");
			break;

		case 2:
			System.out.println("it is tuesday");
			break;

		case 3:
			System.out.println("it is wednesday");
			break;

		case 4:
			System.out.println("it is thursday");
			break;

		case 5:
			System.out.println("it is friday");
			break;

		case 6,7:
			System.out.println("it is the weekend");
			break;

		default:
			System.out.println("invalid day of the week");

	}

}