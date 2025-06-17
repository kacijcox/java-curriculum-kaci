package lists;

public class LibraryBook {
	private String name;
	private String checkOutBy; // name of person checking out book
	private boolean isCheckedOut;

	public LibraryBook(String name, String checkOutBy, boolean isCheckedOut) {
		this.name = name;
		this.checkOutBy = checkOutBy;
		this.isCheckedOut = isCheckedOut;
	}

	public boolean isCheckedOut() {
		return isCheckedOut;
	}

	public void setCheckedOut(boolean checkedOut) {
		isCheckedOut = checkedOut;
	}

	public String getCheckOutBy() {
		return checkOutBy;
	}

	public void setCheckOutBy(String checkOutBy) {
		this.checkOutBy = checkOutBy;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "LibraryBook{" +
				"name='" + name + '\'' +
				", checkOutBy='" + checkOutBy + '\'' +
				", isCheckedOut=" + isCheckedOut +
				'}';
	}
}
