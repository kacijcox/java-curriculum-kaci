public class StringsLesson {
	public static void main (String[] args ) {
//		/** null **/
//		// int nullcheck = null; you cannot initalize a primitive datatype to null
//		String nullString = null; // you are able to initalize an object like a string to a null
//		System.out.println(nullString); // we can print a null value without issues
//
//


////		/** strings **/
////		String name = "kaci";
////		String greeting = "hello " + name;
////		System.out.println(greeting);
//
//		// string methods
//
//		//.length() returns the number of characters in a string
//		System.out.println("just an example of length".length());
//
//		//.index of () finds the first occurance of a character string
//		String searchThis = "this quick brown fox";
//		System.out.println(searchThis.indexOf('a'));
//		System.out.println(searchThis.indexOf("fox"));
//
//		String dateTime = "20250529 10:15:59";
//
//		String year = dateTime.substring(0, 4);
//		String month = dateTime.substring(4, 6);
//		String seconds = dateTime.substring(15,17);
//		String hours = dateTime.substring(9, 11);
//		String minutes = dateTime.substring(12,14);
//		String day = dateTime.substring(6,9);

//		String hours = "";
//		String minutes = "";

//		String seconds = "";
//
//		System.out.println(year);
//
//		// challenge finish these variable assignments using substrings
//
//		System.out.println("Hour: " + hours + "\tMinute: " + minutes + "\tYear: " +  year + "\tMonth: " + month);
//		System.out.println("\tSeonds:" + seconds + "\tDay: " + day);
//
//		//.charAt() is a methoid and takes an int and returns that character at that index
//
//		String charTest = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//		System.out.println(charTest.charAt(7));
//		System.out.println(charTest.charAt(9));
//
//		System.out.println(charTest.charAt(charTest.length()-5));
//
//
//		// .replace()
//		String replaceExample = "directory/to/some/file.java";
//		System.out.println(replaceExample.replace("/", "."));
//
//		// .touppercase and .tolowercase
//
//		System.out.println("uppercase string".toUpperCase());
//		System.out.println("lowercase string".toLowerCase());

		// formatting strings

//		//String.format()
//		String itemName = "table";
//		double priceOfItem = 199.99;
//		String lineItem = String.format("item: %-20 | $%.2f", itemName, priceOfItem);
//		System.out.println(lineItem);
//
//		System.out.printf("item: %-20 | $%.2f", itemName, priceOfItem, 800.50);

		// challlenge
		// print out 3 students formatted like this:
		// kaci cox     | 100 | A
		// jimmy fan    | 80  | B
		// edgar allen  | 70  | C

		String studentOne = "kaci cox";
		String studentTwo = "jimmy fan";
		String studentThree = "edgar allen";

		int studentOneGrade = 100;
		int studentTwoGrade = 80;
		int studentThreeGrade = 70;

		char studentOneLetter = 'A';
		char studentTwoLetter = 'B';
		char studentThreeLetter = 'C';

		String studentOneString = String.format("%-20s | %3d | %c", studentOne, studentOneGrade, studentOneLetter);
		String studentTwoString = String.format("%-20s | %3d | %c", studentTwo, studentTwoGrade, studentTwoLetter);
		String studentThreeString = String.format("%-20s | %3d | %c", studentThree, studentThreeGrade, studentThreeLetter);
		System.out.println(studentOneString);
		System.out.println(studentTwoString);
		System.out.println(studentThreeString);


		// % indicates you will be injecting a value into the string
		// f following the % is a flag that represents the data type of the argument


	}
}
