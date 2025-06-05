import java.util.Scanner;

public class AdventureLab {
	private String userName;
	private int keys = 0;

//    START
//        Welcome to the Adventure!
//        >>> Prompt user to enter their name
//
	public void main() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("welcome to the adventure");
		System.out.println("enter your name:");
		this.userName = scanner.nextLine();

		pageZero();

	}

//    PAGE0
//        You wake up in a dark forest. You see a crossroad ahead of you and approach.
	public void pageZero() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("welcome " + userName + "!");
		System.out.println("you have woken up in a dark forest O_o");
		System.out.println("press enter to continue");
		scanner.nextLine();
		pageOne();


	}
//
//    PAGE1
//        When you arrive at the crossroads you see several possible paths.
//        One path is dark and winding
//        The other path is sunny and bright with lots of flowers
//        In the distance you see an abandoned castle
//        Where do you want to go?
//        >>> prompt the user for a 1, 2, 3
//        1. Dark path (GOTO PAGE2)
//        2. Bright path (GOTO PAGE3)
//        3. Castle (GOTO PAGE4)
	public void pageOne() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("you arrive at the crossroads and see several possible paths");
		System.out.println("one is dark and winding");
		System.out.println("the other path is sunny and bright with lots of flowers");
		System.out.println("in the distance you see an abandoned castle");
		System.out.println("what would you like to do first");
		System.out.println("1. dark path");
		System.out.println("2. bright path");
		System.out.println("3. castle");

		int option = scanner.nextInt();

		switch (option) {
			case 1:
				System.out.println("you chose option 1");
				pageTwo();
			case 2:
				System.out.println("you chose option 2");
				pageThree();
			case 3:
				System.out.println("you chose option 3");
				pageFour();

		}

}
//
//    PAGE2
//        Travelling the dark and winding path,
//        you stumble upon a monster!
//        >>> Prompt the user for a 1 or 2
//        1. Run
//            You choose to run... The monster is much quicker and you are defeated.
//            (GOTO BADEND)
//
//        2. Fight
//            You choose to fight!
//            With a valiant effort, you defeat the monster...
//            And find a key!
//            (GOTO PAGE1)
//        RE-VISIT:
//            After finding the key,
//            There is nothing left to loot on the monster.
//            (GOTO PAGE1)
	public void pageTwo() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("traveling the dark and winding path, you stumble across a monster :o");
		System.out.println("select 1 to run or select 2 to FIGHT");

		int option = scanner.nextInt();

		switch(option) {
			case 1:
				System.out.println("you selected option 1 and chose to run");
				badEnd();
			case 2:
				System.out.println("you chose option 2 and chose to fight");
				System.out.println("with a valiant effort, you defeated the monster");
				System.out.println("and now you have a key!");
				System.out.println("we'll go back to page one now");
				keys++;
				pageOne();
		}
	}


//    PAGE3
//        The flowerly path smells wonderful.
//        You lose track of time on your walk and barely catch yourself from running into someone. S
//        he's a good witch and asks you your name!
//        >>> Prompt user for their name
//        1. Real name
//            You tell the witch your real name.
//            She uses her magic wand to produce a key and gives it to you with her blessing.
//            (GOTO PAGE1)
//
//        2. Fake name
//            The witch can tell you're lying.
//            She uses her magic wand to put you to sleep.
//            You don't remember anything.
//            (GOTO PAGE0)
//
//        RE-VISIT:
//            "Why hello {userName}, I hope you're doing well!" Says the witch.
//            After a quick visit you return to the Forest
//            (GOTO PAGE1)
	public void pageThree() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("the flowery path smells wonderful");
		System.out.println("you lose track of time on your walk and barely catch yourself from running into someone.");
		System.out.println("she's a good witch and asks for your name");
		System.out.println("select option 1 to give her your real name, and option 2 to give her a fake name");

		int option = scanner.nextInt();

		switch (option) {
			case 1:
				System.out.println("you chose option 1 and decided to give her your real name");
				System.out.println("the witch uses her magic wand to produce a key");
				keys++;
				pageOne();
			case 2:
				System.out.println("you chose option 2 and decided to give her a fake name");
				System.out.println("the witch can tell you are lying. you'll wake up and remember nothing");
				pageZero();
		}

	}
//    PAGE4
//        Inside the castle you see two doors.
//        >>> Prompt the user for a 1,2 or 3
//        1. Blue door (GOTO PAGE5)
//        2. Red door (GOTO PAGE6)
//        3. Return to crossroads
	public void pageFour() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("inside the castle you see two doors");
		System.out.println("what do you choose?");
		System.out.println("select option 1 for the blue door and option 2 for the red door");
		System.out.println("select option 3 to return to the crossroads");

		int option = scanner.nextInt();

		switch (option) {
			case 1:
				System.out.println("you chose the blue door");
				pageFive();
			case 2:
				System.out.println("you chose the red door");
				pageSix();
			case 3:
				System.out.println("you chose option 3, returning to the crossroads");
				pageOne();

		}

	}
//
//    PAGE5
//        You see a locked blue door with 3 keyholes.
//        >>> Check if user has 3 keys
//        Has 3 keys
//            (GOTO GOODEND)
//        Does not have 3 Keys
//            The door is locked and requires 3 keys.
//            You leave to find more keys
//            (GOTO PAGE4)
	public void pageFive() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("you see a locked blue door with 3 keyholes");

		if (keys == 3) {
			System.out.println("you have 3 keys");
			goodEnd();
		} else {
			System.out.println("the door is locked and requires 3 keys");
			System.out.println("you leave to find more keys");
			pageFour();
		}

	}
//
//    PAGE6
//        You find the red door is unlocked.
//        After searching the room you find a key!
//        You leave the room and continue searching the castle
//        (GOTO PAGE4)
//        RE-VISIT:
//            You feel like you've searched this room thoroughly.
//            (GOTO PAGE4)
	public void pageSix () {
		System.out.println("you find the red door is unlocked");
		System.out.println("after searching the room you find a key");
		System.out.println("you leave the room and continue searching the casle");
		System.out.println("you feel like you've searched this room thoroughly");
		keys++;
		pageFour();
	}
//
//    BADEND
//        You have failed in your quest.
//        Would you like to try again?
//        >>> Prompt 1 or 2
//        1. Yes. (GOTO START)
//        2. No. (End Game)
	public void badEnd () {
		System.out.println("you have failed your quest. would you like to try again? press 1 for yes and 2 to exit");
		Scanner scanner = new Scanner(System.in);

		int option = scanner.nextInt();


		switch (option) {
			case 1:
				System.out.println("restarting game");
				pageZero();
			case 2:
				System.out.println("you chose to exit");
				System.exit(0);
		}
	}
//
//    GOODEND
//        Inside the blue door you find endless treasure, and you are set for life!
//        Congrats!
//        (End Game)
	public void goodEnd () {
		System.out.println("inside the blue door you find endless treasure, and you are set for life. congrats!");
		System.out.println("would you like to play again? press 1 for yes and 2 to exit");
		Scanner scanner = new Scanner(System.in);

		int option = scanner.nextInt();

		switch (option) {
			case 1:
				System.out.println("restarting game");
				pageZero();
				break;
			case 2:
				System.out.println("you chose to exit");
				System.exit(0);
		}
	}

}
