package lists;

import java.util.Stack;

public class StackLesson {

	public static void main(String[] args) {

		//stacks are FILO (first in last out/ last in, first out )
		// we use a stack when we want to process the most recent

		Stack<String> messages = new Stack<>();

		messages.push("car with headlights in parking lot");
		messages.push("security camera out of order in hallway");
		messages.push("items stolen from locker room");

		System.out.println(messages.peek()); // returns the value of the most recently added element
		System.out.println(messages.pop()); // removes and return the most recently added element
		System.out.println(messages.pop());
		System.out.println(messages.pop());



	}
}
