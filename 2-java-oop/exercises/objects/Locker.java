package objects;

import org.w3c.dom.ls.LSOutput;

public class Locker {
	private String lockerID;
	private boolean isOccupied;
	private String contents;
	private int pin;


	//constructer methods
	public Locker(String lockerID, boolean isOccupied, String contents, int pin) {
		this.lockerID = lockerID;
		this.isOccupied = false;
		this.contents = "";
		this.pin = pin;
	}

	public void storeItem(String item) {
		this.isOccupied = true;
		this.contents = item;
		System.out.println("item stored in locker " + this.lockerID);
		System.out.println("locker contents: " + this.contents);
	}

	public void removeItem() {
		this.isOccupied = false;
		this.contents = "";
		System.out.println("locker " + this.lockerID + " is empty");
	}

	public String getLockerID() {
		return lockerID;
	}
	public void setLockerID (String lockerID) {
		this.lockerID = lockerID;
	}
	public boolean getIsOccupied() {
		return isOccupied;
	}
	public void setIsOccupied (boolean isOccupied) {
		this.isOccupied = isOccupied;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	@Override
	public String toString() {
		// toString() returns a String that represents an instantiated object of this class
		return "lockerID: " + lockerID + "contents: " + contents + "pin: " + pin + "isOccupied: " + isOccupied + "\n";
	}
}