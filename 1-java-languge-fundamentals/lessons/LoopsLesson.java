import java.util.Scanner;

public class LoopsLesson {

	public static void main(String[] args) {

//		int startingValue = 5;
//		for (int i = startingValue; i < 20; i++) {
//			if (i % 3 == 0) {
//				continue;
//			}
//			if (i == 16) {
//				break;
//			}
//			System.out.println(i);
//
//		}

//		// while loop
//		while(condiiton) {
//			instructions
//		}
//		// do  {
//		instructions
//	} while(condition)
//		int i = 0;
//		while (i <= 20) {
//			System.out.println(i);
//			i++;
//			if(i % 3 == 0) {
//				continue;
//			}
//			if(i == 16) {
//				break;
//			}
//			System.out.println(i);
//
//		}


		// challenge
		// prompt user for a number
		// print odd numbers from zero to that number
		String userInput = "";
		Scanner console = new Scanner(System.in);
		System.out.println("enter a number");
		userInput = console.nextLine();
		int userNumber = Integer.parseInt(userInput);
		int counter = 1;
		while (counter < userNumber) {
			System.out.println(counter);
			counter += 2;


		}

		for(int i = 1; i <= userNumber; i += 2) {
			System.out.println(i);
		}


		int doWhileCounter = 1;
		do {
			System.out.println();
			doWhileCounter++;
		}
		while(doWhileCounter <= userNumber);






	}
}
