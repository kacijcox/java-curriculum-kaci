package lists;

import lists.LibraryBook;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class LibrarySystem {

	public static void main(String[] args) {
		// stack of books to process and return to shelves
		Stack<LibraryBook> returnedBooks = new Stack<>();

		returnedBooks.push(new LibraryBook("Moby Dick", "Joanne Smith", true));
		returnedBooks.push(new LibraryBook("Pride and Prejudice", "Joanne Smith", true));
		returnedBooks.push(new LibraryBook("The Hobbit", "Jack Jones", true));

		// queue of books that are processed as they are returned to shelves
		Queue<LibraryBook> booksToShelves = new LinkedList<>();

		for (int i = 0; i < 3; i++) {
			returnedBooks.peek().setCheckedOut(false);
			returnedBooks.peek().setCheckOutBy("");
			booksToShelves.add(returnedBooks.pop());
		}
	}
}
