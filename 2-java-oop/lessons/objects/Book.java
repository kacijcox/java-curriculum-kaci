package objects;  // package keyword describes the location of this file, and from where it is accessible

// Challenge
// Two books should be equal if their title and author are the same - create .equals() for this
// Books should be sorted by Author alphabetically, and then by title alphabetically - implement comparable and create .compareTo() for this

import java.util.Objects;

public class Book {
	// Encapsulation - private fields/properties that cannot be interacted with outside of this class
	private String title;
	private String author;
	private boolean isCheckedOut;
	private String checkedOutBy;
	private String ISBN;
	private boolean isFiction;
	private int pageNumber;

	private static int numberOfBooks = 0;

	// Constructor methods
	// public - constructors must be public
	// constructors are always the exact same name as the class
	// constructors do not a have a return value, they only describe default values used to instantiate an object of this class
	public Book(String title, String author, String ISBN, int pageNumber) {
		// properties we want to add to a new object via parameters
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		this.pageNumber = pageNumber;

		// we can also default values
		this.isCheckedOut = false;
		this.checkedOutBy = null;
	}

	public static int getNumberOfBooks() {
		return numberOfBooks;
	}


	// constructor methods can be overloaded, meaning they have the same name but different parameters
	public Book(String title, String author, int pageNumber) {
		// properties we want to add to a new object via parameters
		this.title = title;
		this.author = author;
		this.pageNumber = pageNumber;

		// we can also default values
		this.isCheckedOut = false;
		this.checkedOutBy = null;
		this.ISBN = null;
	}

	// return false if already checked out
	// return true otherwise
	// set checkedOutBy to customer name passed as parameter
	// set isCheckedOut to true
	public boolean checkOut(String customer) {
		if (isCheckedOut) {
			return false;
		}
		checkedOutBy = customer;
		isCheckedOut = true;
		return true;
	}

	// return false if not checked out
	// set isCheckedOut to false
	// set checkedOutBy to null
	// return true
	public boolean checkIn() {
		if (!isCheckedOut) {
			return false;
		}
		isCheckedOut = false;
		checkedOutBy = null;
		return true;
	}

	// Getters and Setters
	// public methods that correlate to a property and allow them to be modified externally
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		// this. refers to the properties and methods of this class,
		// we use it to distinguish between the parameter coming into our setter and the class' property
		this.title = title;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}

	// boolean values can have a different structure for their getters and setters
	public boolean getCheckedOut() {
		return isCheckedOut;
	}

	/* another example of how a boolean
		public boolean isCheckedOut() {
			return isCheckedOut;
		}
	 */
	public void setCheckedOut(boolean checkedOut) {
		isCheckedOut = checkedOut;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCheckedOutBy() {
		return checkedOutBy;
	}

	public void setCheckedOutBy(String checkedOutBy) {
		this.checkedOutBy = checkedOutBy;
	}

	public boolean getFiction() {
		return isFiction;
	}

	public void setFiction(boolean isFiction) {
		this.isFiction = isFiction;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	// @Override is an annotation that helps make our code more descriptive
	@Override
	public String toString() {
		// toString() returns a String that represents an instantiated object of this class
		return "Title: " + title + " Author: " + author + " Number of pages: " + pageNumber;
	}

	@Override
	public boolean equals(Object o) {
		if (o == null || getClass() != o.getClass()) return false;
		Book book = (Book) o;
		return isCheckedOut == book.isCheckedOut && isFiction == book.isFiction && pageNumber == book.pageNumber && Objects.equals(title, book.title) && Objects.equals(author, book.author) && Objects.equals(checkedOutBy, book.checkedOutBy) && Objects.equals(ISBN, book.ISBN);
	}

}


