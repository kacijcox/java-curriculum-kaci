import java.util.Scanner;

public class ArraysLesson {
	public static void main(String[] args) {


		// arrays
		// every element in an array must be the same type
		// we specify the datatype of the array when we initalize it
		// String [] - creating a new array of strings
		// colors - just the variable name we want to assign this array
		// new - keyword for initalizing this array and creating a space in memory
		// int[5] - the max number of elements this array can hold

		int[] grades = new int[5];
		grades[0] = 70;
		grades[1] = 80;
		grades[2] = 99;
		grades[3] = 85;
		grades[4] = 90;

		String[] students = new String[5];
		students[0] = "pat";
		students[1] = "angel";
		students[2] = "chris";
		students[3] = "jess";
		students[4] = "jo";

		Scanner console = new Scanner(System.in);
		System.out.println("enter student number");
		int studentNumber = Integer.parseInt(console.nextLine());
		System.out.println("student name: " + students[studentNumber] + " " + grades[studentNumber]);

//		// shorthand for initalizing an array of the default values
		double[] temps = {100.5, 98.5, 88.7, 92};

		System.out.println(temps[0]);
		System.out.println(temps[1]);
		System.out.println(temps[2]);
		System.out.println(temps[3]);



//		.length is a property of an array that lets you know how many elements it contains

		System.out.println(students.length);

		for (int i =0; i < students.length; i++){
			System.out.println(students[i] + " " + grades[i]);
		}

		// challenge: print the studentName/grades in reverse
		for (int i  = students.length -1; i >= 0; i--){
			System.out.println(students[i] + " " + grades[i]);
		}

		// for each loop
		// iterate through all the temps array
		// for keyword
		// speicify the data type and name of each element of the arrat, we will use this in the body to work
		// with the current element
		// : - colon in a for-each loops means in
		// temps - an array or some kind of iterable objecty that we want to loop through

		int counter = 0;
		for (double temp : temps) {
			System.out.println(temp + " on day " + counter);
			counter++;
		}
	}
}


