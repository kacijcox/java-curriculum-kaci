package sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SetLesson {
	public static void main(String[] args) {
		// initialize a new set
		Set<String> set = new HashSet<>(); // set interface can be implemented with a HashSet, TreeSet, LinkHashSet

		// adding elements to a set with .add()

		set.add(String.valueOf("one".hashCode()));
		set.add("two");
		set.add(null);
		set.add("three");
		set.add("four");
		set.add("five");

		System.out.println(set);

		// remove duplicates from another data structure
		ArrayList<Integer> listWithDuplicates = new ArrayList<>();
		// add a list of random integers to this array list

		listWithDuplicates.add(1);
		listWithDuplicates.add(1);
		listWithDuplicates.add(2);
		listWithDuplicates.add(2);
		listWithDuplicates.add(3);
		listWithDuplicates.add(3);


		Set<Integer> setWithoutDuplicates = new HashSet<>();
		// use this set to remove all the duplicates
		 setWithoutDuplicates.addAll((listWithDuplicates));
		System.out.println(setWithoutDuplicates);
		System.out.println(setWithoutDuplicates);

		Integer setCheck = 5;
		if(setWithoutDuplicates.contains(setCheck)) {
			System.out.println("contains " + setCheck);
		}
		else {
			System.out.println("does not contain " + setCheck);
		}

		// challenge print off all the elements in listWithDuplicates using a set
		Set<Integer> duplicateCheck = new HashSet<>();
		for(Integer number : listWithDuplicates) {
			if(duplicateCheck.contains(duplicateCheck)) {
				System.out.println(number);
			}
			else {
				duplicateCheck.add(number);
			}
		}
		/// ////////////////////////////////////////

		Set<Integer> duplicateCheck1 = new HashSet<>();
		String printMe = "";
		for(Integer number : listWithDuplicates) {
			if(duplicateCheck1.contains(number) && printMe.contains(number.toString())) {
				printMe += number + "\n";
			}
			else {
				duplicateCheck1.add(number);
			}
		}
		System.out.println(printMe);
	}
}
