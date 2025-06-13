package interfaces;

import objects.Locker;

import java.util.ArrayList;

public class InterfaceExercise {
	public static void main(String[] args) {
		ArrayList<Locker> lockerList = new ArrayList<>();
		LockerManager manager = new LockerManager(lockerList);

		System.out.println("--personal locker test--");
		manager.rentLocker("locker1");
		manager.emptyLocker("locker1");

		System.out.println("--personal locker test--");
		manager.rentLocker("locker2");
		manager.emptyLocker("locker2");
	}
}

