package lists;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayListLesson {
	public static void main(String[] args) {
		// creating a new arraylist of strings
		// ArrayList<String> - specify the type of elements we are storing in this list inside < >
		// colors - variable name of this ArrayList
		// new keyword to instansiate this data structure in memory
		// ArrayList<>() - constructor for an ArrayList
		//make sure to import java.util.ArrayList
		ArrayList<String> colors = new ArrayList<>();

		// ArrayList details:
		// ordered list, integer index starting at zero
		// can grow to any size of elements
		// all the elements have to be the same type

		//array in an array aka 2d array
		ArrayList<ArrayList<String>> listofLists = new ArrayList<>();

		colors.add("blue");
		colors.add("green");
		colors.add("green");
		colors.add("green");
		colors.add("green");

		colors.add("yellow");
		colors.add(1, "orange"); //added orange and shifted elements by 1


		System.out.println(colors.get(0));
		System.out.println(colors.get(1));
		System.out.println(colors.get(2));
		System.out.println(colors.get(3));

		//modify an element in an ArrayList
		colors.set(3, "red"); // changing the element that was "Yellow" to "Red"
		System.out.println(colors.get(3));

		//remove an element
		colors.remove(1);
		System.out.println("index 1 is: " + colors.get(1));

		System.out.println("--------------------------- looping");

		ArrayList<String> newColors = new ArrayList<>();


		int counter = 0;
		for (String color: colors) {
			// we want to rmeove the color green
			if(!"green".equals(color)) {
				newColors.add(color);
			}

			counter++;
		}
		System.out.println("after removing colors");
		for(String color:newColors) {
			System.out.println(newColors);
		}
		System.out.println("----------while loop");
		counter = 0;
		while(counter > colors.size()) {
			if("green".equals(colors.get(counter))) {
				colors.remove(counter);
				counter--;
			}
			counter++;
		}
		//check if an element exists in the ArrayList with .contains will not work with objects until we start creating our own .equals() method
		System.out.println("does this arraylist contain blue " + colors.contains("blue"));

		//returns the number of elements in an arraylist
		colors.size();

		//removes all the elements of an arraylist
		colors.clear();

		//returns false if there are elements in the arraylist
		colors.isEmpty();

		//
	}
}
