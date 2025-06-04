import java.util.Scanner;

public class MethodsLesson {

	// Access Modifier - can be empty/default, public, private, protected
	// Static - method/data belongs to class and not any specific instantiated object of that class
	// Return Type - you must specify exactly what data type a method will return, or void if it doesn't return a value
	// Method name - should be a descriptive name that informs others what the method does. follows variable naming conventions
	// Parameters - what is needing to be passed into the method for it to work, must specify the data type and give a descriptive name
	//              multiple parameters can be passed to a method and are separated by commas
	// Method Signature - Method mame and all parameters that uniquely identify this method
	public static int sum(int num1, int num2) {
		int total = 0;

		total = num1 + num2;

		// return keyword returns a single value from the method and returns execution to where the method was called
		return total;
	}

	// method to print the largest value found in an int array
	public static void findMax(int[] numbers) {
		// jump out of method early if numbers array is empty
		if(numbers.length == 0) {
			System.out.println("Empty array");
			return;
		}
		// set the starting value of currentMax to the first element of the numbers array
		int currentMax = numbers[0];
		for(int i = 1; i < numbers.length; i++ ) { // starting with the second element loop through array
			if(numbers[i] > currentMax) {
				currentMax = numbers[i];
			}
		}

		System.out.println("Largest value in array: " + currentMax);
	}

	public static double average(int[] numbers) {
		double average = 0;
		if(numbers.length == 0) {
			return average;
		}

		for(int number : numbers) {
			average += number;
		}

		average = average / numbers.length;

		return average;
	}

	// create a method that will prompt the user and then return a parsed int
	public static int getUserInt(String prompt, int min, int max) {
		int userInt = 0;
		do {
			userInt = Integer.parseInt(getUserInput(prompt));
		} while(min > userInt || max < userInt );

		return userInt;
	}


	// create a method to prompt the user for a String
	public static String getUserInput(String prompt) {
		String userInput = "";

		System.out.println(prompt);
		Scanner console = new Scanner(System.in);
		userInput = console.nextLine();

		return userInput;
	}

	// your methods can call other methods you've created  <<<
	// methods can call themselves, this is called recursion

	// Method Overloading
	// Methods can share the same name but have different method signatures
	// Same name, different number or types of parameters
	// the method getUserInt(String prompt) is an overloaded method of getUserInt(String prompt, int min, int max)
	public static int getUserInt(String prompt) {
		int userInt = 0;

		userInt = Integer.parseInt(getUserInput(prompt));

		return userInt;
	}




	public static void main(String[] args) {
		// Call a method by creating an instance of an object or using a static method of a class
//        System.out.println("Printing something"); // is an example of using a static method of a class
//        Integer.parseInt("12");
//        Scanner console = new Scanner(System.in); // creating an instance of the Scanner class (an Object)
//
//        int methodTest = sum(7, 10);
//        System.out.println("The return of sum is: " + methodTest);
//
//        int[] numbers = {};
//        findMax(numbers);
//
//        // Challenge    - create a method that takes in an int array and return the average
//        //              - test your method by calling it in main
//        int[] intArray = {100, 101, 4, 8, 16, 24, 32, 40, 80};
//        System.out.println(average(intArray));
//
//        String favoriteColor = getUserInput("What is your favorite color?");
//        int min = 0;
//        int max = 1000;
//        int favoriteNumber = getUserInt("What is your favorite number (1 to 1000) ", min, max);
//        System.out.println("Your favorite color is: " + favoriteColor + "\tYour favorite number is: " + favoriteNumber);

		// example of overloaded method in Java Library
		System.out.println(Double.valueOf(2.000));
		System.out.println(Double.valueOf("2.0"));
	}
}
