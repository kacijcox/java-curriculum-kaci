import java.util.Scanner;


public class ArraysExercise {
	public static void main(String[] args) {

		/* 1. Initializing Arrays */
		// Initialize an array of Strings to store the titles of up to 10 novels
		// Store the titles of five novels in the first 5 indexes
		// Print out the novels in the array, skipping any nulls.
		//
		// Example Output:
		//
		//  Watership Down
		//  The Three-Body Problem
		//  The Picture of Dorian Gray
		//  The Maltese Falcon
		//  The Stranger

		String[] novels = new String[10];
		novels[0] = "to kill a mockingbird";
		novels[1] = "the great gasby";
		novels[2] = "the lord of the rings";
		novels[3] = "catch-22";
		novels[4] = "treasure island";

		for (int i = 0; i < novels.length; i++) {
			if (novels[i] != null)
				System.out.println(novels[i]);
		}





		/* 2. Average of an Array */
		// Print the average of the following array of integers to the console
		int[] intArray = {100, 101, 4, 8, 16, 24, 32, 40, 80};

		int sum = 0;
		for (int i = 0; i < intArray.length; i++) {
			sum += intArray[i];
		}
		double average = (double) sum / intArray.length;
		System.out.println(average);

		// Print the average of the following array of doubles to the console
		double[] doubleArray = {70.4, 80.5, 1100, 52, 12};

		sum = 0;
		for (double i = 0; i < doubleArray.length; i++) {
			sum += doubleArray[(int) i];
		}
		double secondAverage = (double) sum / doubleArray.length;
		System.out.println(secondAverage);



		/* 3. Print Out Common Elements In Two Arrays */
		// Print out any values in arrayOne that exist in arrayTwo
		// The order you print them out doesn't matter, but you shouldn't have the same number print twice
		int[] arrayOne = {1, 7, 1, 2, 4, 5, 6, 7};
		int[] arrayTwo = {7, 1, 4, 4, 5, 8, 1, 1};
//		// Example Output:
//		//  1 4 5 7
//
//		// for i in arrayOne that equals i in arrayTwo print i - doubles

		for (int i = 0; i < arrayOne.length; i++) {
			for (int o = 0; o < arrayTwo.length; o++) {
				if (arrayOne[i] == arrayTwo[o]) {
					System.out.println(arrayOne[i] + "");
					break;
				}
			}
		}


		/* 4. Shift Elements in Array */
		// using a loop, take all elements in the shiftMe Array and shift their indexes by 2
		// fill in the empty spaces in indexes 0 and 1 with zeroes
		// print all values in the shiftMe array to the console

		int[] shiftMe = new int[5];
		shiftMe[0] = 21015;
		shiftMe[1] = 17;
		shiftMe[2] = 0;
		shiftMe[3] = 42;
		shiftMe[4] = -8;

		for (int i = 0; i < shiftMe.length; i++) {
			if (i == 0 || i == 1) {
				shiftMe[i] = 0;
			}
			System.out.println(shiftMe[i]);
		}


		/* 5. Remove Duplicate Elements */
		// Given an array containing duplicate values,
		// initialize a new array that contains only values that occur multiple times in the original array
		// print out all values of the new array
		int[] removeDuplicates = {1, 0, 7, 1, 2, 4, 5, 6, 7, 7, 1, 4, 4, 5, 8, 1, 1};
		// Example Output:
		//  1
		//  7
		//  4
		//  5

		int[] newArray = new int[10];
		for (int i = 0; i < removeDuplicates.length; i++) {
			newArray[removeDuplicates[i]]++;
		}

		for (int i = 0; i < newArray.length; i++) {
			if (newArray[i] > 1) {
				System.out.println(i);
			}
		}


		/* 6. Arrays and User Input (Transaction Calculator 2.0) */
		// Practice managing multiple arrays
		// Create a loop that will allow a user to add up to 10 line items, prompting for each of the following:
		//      Ask number of an item to purchase
		//      Ask for the price per item
		//
		// Have a way for the user to stop adding items
		// Print the total of all line items
		// Hint: You can use the String.format() or System.out.printf() methods to do basic rounding for this problem
		//
		// Example Output:
		//  Enter the number of items: 8
		//  Enter the cost per item: 14.95
		//  Enter more items?: y
		//  Enter the number of items: 1
		//  Enter the cost per item: 9.99
		//  Enter more items?: y
		//  Enter the number of items: 3
		//  Enter the cost per item: 199.99
		//  Enter more items?: n
		//  Total Cost: $729.5//  6

		String userInput = "";
		int numOfItems = 0;
		double pricePerItem = 0;
		double totalCost = 0;
		Scanner console = new Scanner(System.in);

		int[] itemsArray = new int[10];

		for (int i = 0; i < 10; i++) {
			System.out.println("enter the number of items");
			numOfItems = Integer.parseInt(console.nextLine());
			System.out.println("what is the price per item");
			pricePerItem = Double.parseDouble(console.nextLine());
			System.out.println("enter more items?");
			userInput = console.nextLine();
			if (userInput.equals("n")) {
				totalCost = numOfItems * pricePerItem;
				System.out.println("your total cost is:");
				System.out.printf("%.2f", totalCost);
				break;
			}

			while (userInput.equals("y")) {
				System.out.println("enter the number of items");
				numOfItems = Integer.parseInt(console.nextLine());
			}

		}
//		if (userInput.equals("n")) {
//			totalCost = numOfItems * pricePerItem;
//			System.out.println("your total cost is:");
//			System.out.printf("%.2f", totalCost);
//		}
//
//		while (userInput.equals("y")) {
//			System.out.println("enter the number of items");
//			numOfItems = Integer.parseInt(console.nextLine());
//		}

		}

	}

