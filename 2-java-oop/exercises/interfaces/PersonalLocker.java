package interfaces;

import objects.Locker;
import java.util.Scanner;

public class PersonalLocker extends Locker implements PinService{
	private int pin;
	private int setPin;


	public PersonalLocker(String lockerID, boolean isOccupied, String contents, int pin, int setPin) {
		super(lockerID, isOccupied, contents, pin);
		this.pin = pin;
		this.setPin = setPin;
	}

	@Override
	public int getPin() {
		return pin;
	}

	@Override
	public void setPin(int pin) {
		this.pin = pin;
	}

	@Override
	public String getNewPin() {
		System.out.println("enter a 4 digit pin");
		pin = new Scanner(System.in).nextInt();
		System.out.println("pin has been set");
		return Integer.toString(pin);
	}

	@Override
	public boolean checkPin() {
		for (int attempts = 0; attempts < 3; attempts++) {
			System.out.println("enter a 4 digit pin");
			int pinToCheck = new Scanner(System.in).nextInt();

			if(pinToCheck == this.pin) {
				return true;
			}
			else {
				if (attempts < 2) {
					System.out.println("invalid pin");
				}
			}
		}

		// After 3 failed attempts
		System.out.println("invalid pin - maximum attempts exceeded");
		return false;
	}


	public int getSetPin() {
		return setPin;
	}

	public void setSetPin(int setPin) {
		this.setPin = setPin;
	}
}
