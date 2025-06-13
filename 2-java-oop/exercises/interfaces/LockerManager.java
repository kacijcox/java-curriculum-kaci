package interfaces;
import objects.Locker;
import java.util.ArrayList;
import java.util.Scanner;

public class LockerManager {
	ArrayList<Locker> lockers = new ArrayList<>();

	public LockerManager(ArrayList<Locker> lockers) {
			this.lockers = lockers;

			for (int i = 0; i < 5; i++) {
				lockers.add(new PersonalLocker("locker" + i, false, "", 0, 0));
			}
			for (int i = 5; i < 10; i++) {  // Changed: start from 5 instead of 0
				lockers.add(new ValetLocker("locker" + i, false, "", 0, 0));
			}
		}


		public void rentLocker(String lockerID) {
		Scanner scanner = new Scanner(System.in);
		for (Locker locker : lockers) {
			if (locker.getLockerID().equals(lockerID)) {
				if (locker instanceof PinService) {
					PinService pinServiceLocker = (PinService) locker;
					String pinResult = pinServiceLocker.getNewPin();
					System.out.println(pinResult);
					locker.setIsOccupied(true);
					System.out.println("locker " + lockerID + " is now occupied");
					return;
				}
			}
		}
	}

	public void emptyLocker(String lockerID) {
		for (Locker locker : lockers) {
			if (locker.getLockerID().equals(lockerID)) {
				if (locker instanceof PinService) {
					PinService pinServiceLocker = (PinService) locker;
					boolean success = pinServiceLocker.checkPin();
					if (success) {
						locker.setIsOccupied(false);
						System.out.println("locker " + lockerID + " is now empty");
					}
				}
				return;
			}
		}
	}
}
