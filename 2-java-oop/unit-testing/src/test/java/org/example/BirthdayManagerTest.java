package org.example;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class BirthdayManagerTest {
	BirthdayManager myManager;
	Friend testFriend1;
	List<Gift> testGifts;

	@BeforeEach
	public void setup(){
		myManager = new BirthdayManager();

		testFriend1 = new Friend("Bob", "08/01/2002");

		testGifts = new ArrayList<>();
		testGifts.add(new Gift("Pony", "Small"));
		testGifts.add(new Gift("Flowers", "Extra Large"));
	}

	@Test
	public void birthdayManager_addFriend_addNewFriend(){
		// Arrange

		// Act
		myManager.addFriend(testFriend1);

		// Assert
		Assertions.assertEquals(1, myManager.getFriends().size());
		Assertions.assertEquals(testFriend1.getName(), myManager.getFriends().get(0).getName());
		Assertions.assertEquals(testFriend1.getBirthday(), myManager.getFriends().get(0).getBirthday());
	}

	@Test
	public void birthdayManager_addFriend_addExistingFriend(){
		// Arrange

		// Act
		myManager.addFriend(testFriend1);
		myManager.addGift(testFriend1, testGifts.get(0));
		myManager.addGift(testFriend1, testGifts.get(1));

		myManager.addFriend(testFriend1);

		// Assert
		Assertions.assertEquals(1, myManager.getFriends().size());
		Assertions.assertEquals(testFriend1.getName(), myManager.getFriends().get(0).getName());
		Assertions.assertEquals(testFriend1.getBirthday(), myManager.getFriends().get(0).getBirthday());
		Assertions.assertTrue(myManager.getGiftsForFriend(testFriend1).containsAll(testGifts));
		Assertions.assertEquals(2, myManager.getGiftsForFriend(testFriend1).size());
	}

	@Test
	public void birthdayManager_addGift_addGiftToExistingFriend() {
		myManager.addFriend(testFriend1);
		myManager.addGift(testFriend1, testGifts.get(0));
		myManager.addGift(testFriend1, testGifts.get(1));

		Assertions.assertTrue(myManager.getGiftsForFriend(testFriend1).containsAll(testGifts));
		Assertions.assertEquals(2, myManager.getGiftsForFriend(testFriend1).size());
	}

	@Test
	public void birthdayManager_addGift_addGiftToNonExistingFriend() {
		myManager.addGift(testFriend1, testGifts.get(0));

		Assertions.assertTrue(myManager.getGiftsForFriend(testFriend1).contains(testGifts.get(0)));
		Assertions.assertEquals(1, myManager.getGiftsForFriend(testFriend1).size());
	}

	@Test
	public void birthdayManager_removeFriend_removeExistingFriend() {
		// Arrange
		myManager.addFriend(testFriend1);

		// Act
		myManager.removeFriend(testFriend1);

		// Assert
		Assertions.assertTrue(myManager.getFriends().isEmpty());

	}

	@Test
	public void birthdayManager_removeFriend_removeNonExistingFriend() {

		// Act
		myManager.removeFriend(testFriend1);

		// Assert
		Assertions.assertTrue(myManager.getFriends().isEmpty());
	}

	@Test
	public void birthdayManager_getGiftsForFriend_existingFriend() {
		myManager.addFriend(testFriend1);
		myManager.addGift(testFriend1, testGifts.get(0));
		myManager.addGift(testFriend1, testGifts.get(1));

		Assertions.assertTrue(myManager.getGiftsForFriend(testFriend1).containsAll(testGifts));
		Assertions.assertEquals(2, myManager.getGiftsForFriend(testFriend1).size());
	}

	@Test
	public void birthdayManager_getGiftsForFriend_nonexistingFriend() {
		Assertions.assertTrue(myManager.getGiftsForFriend(testFriend1).isEmpty());
	}

}