package objects;

import java.util.ArrayList;

public class Library {
	public static void main(String[] args) {
		// instantiate a book object from the book class blueprint
		// memory is allocated for this object using the new keyword
		Book mobyDick = new Book("Moby-Dick", "Herm Melville", "978-1503280786", 700 );


		System.out.println(mobyDick.getAuthor());
		mobyDick.setCheckedOutBy("Pat");
		System.out.println(mobyDick.getCheckedOutBy());
		System.out.println(Book.getNumberOfBooks()); //calling get number of books directly from the class


		Book secondBook = new Book("Stranger in a Strange Land", "Robert Heinlein", 300);
		System.out.println(Book.getNumberOfBooks()); //calling get number of books directly from the class
		//ConsoleUI.getInt("Enter a book title: ");")

		secondBook.checkOut("Customer number 1");
		System.out.println("Title: " + secondBook.getTitle() +"\nChecked out by: "+ secondBook.getCheckedOutBy());
		secondBook.checkIn();

		System.out.println("Title: " + secondBook.getTitle() +"\nChecked out by: "+ secondBook.getCheckedOutBy());

		System.out.println(mobyDick);
		System.out.println(secondBook);
		System.out.println(Book.getNumberOfBooks());

	}
}
