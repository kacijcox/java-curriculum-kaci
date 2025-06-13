package interfaces;

import objects.Locker;

import java.util.Scanner;

public class ValetLocker extends Locker implements PinService{
	private int pin;
	private int setPin;


	public ValetLocker(String lockerID, boolean isOccupied, String contents, int pin, int setPin) {
		super(lockerID, isOccupied, contents, pin);
		this.pin = pin;
		this.setPin = setPin;
	}


	@Override
	public String getNewPin() {
		System.out.println("generating random 4 digit pin");
		pin = (int) (Math.random() * 9000) + 1000;
		System.out.println("pin has been set");
		return Integer.toString(setPin);
	}

	@Override
	public boolean checkPin() {
		System.out.println("enter your 4 digit pin");
		int pinToCheck = new Scanner(System.in).nextInt();
		if(pinToCheck == this.pin) {
			return true;
		}
		else {
			System.out.println("invalid pin");
		}
		return false;
	}




	@Override
	public int getPin() {
		return pin;
	}

	@Override
	public void setPin(int pin) {
		this.pin = pin;
	}

	public int getSetPin() {
		return setPin;
	}

	public void setSetPin(int setPin) {
		this.setPin = setPin;
	}
}
