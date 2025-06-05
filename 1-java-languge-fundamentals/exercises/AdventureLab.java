import java.util.Scanner;

public class AdventureLab {
	private static String userName;
	private static int keys = 0;
	private static boolean monsterKeyTaken = false;
	private static boolean witchKeyTaken = false;
	private static boolean redRoomKeyTaken = false;
	private static Scanner scanner = new Scanner(System.in);


	//    START
//        Welcome to the Adventure!
//        >>> Prompt user to enter their name
//
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("welcome to the adventure");
		System.out.println("enter your name: ");
		userName = scanner.nextLine();
		System.out.println("\n");
		pageZero(args);

	}

//    PAGE0
//        You wake up in a dark forest. You see a crossroad ahead of you and approach.
	public static void pageZero(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("welcome " + userName + "!");
		System.out.println("you have woken up in a dark forest O_o");
		System.out.println("press any key to continue");
		scanner.nextLine();
		System.out.println("\n");
		pageOne(args);


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
	public static void pageOne(String[] args) {
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
				System.out.println("\n");
				pageTwo(args);
			case 2:
				System.out.println("you chose option 2");
				System.out.println("\n");
				pageThree(args);
			case 3:
				System.out.println("you chose option 3");
				System.out.println("\n");
				pageFour(args);

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
	public static void pageTwo(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("traveling the dark and winding path, you stumble across a monster :o");
		System.out.println("select 1 to run or select 2 to FIGHT");

		int option = scanner.nextInt();

		switch(option) {
			case 1:
				System.out.println("you selected option 1 and chose to run");
				badEnd(args);
			case 2:
				System.out.println("you chose option 2 and chose to fight");
				System.out.println("with a valiant effort, you defeated the monster");
				if (!monsterKeyTaken) {
					System.out.println("and found a key!");
					monsterKeyTaken = true;
					keys++;
					System.out.println("\n");
					pageOne(args);
				}
				else {
					System.out.println("you have already collected a key from here");
					System.out.println("\n");
					pageOne(args);
				}
				System.out.println("we'll go back to page one now");
				keys++;
				System.out.println("\n");
				pageOne(args);
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
	public static void pageThree(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("the flowery path smells wonderful");
		System.out.println("you lose track of time on your walk and barely catch yourself from running into someone. \n");
		System.out.println("she's a good witch and asks for your name \n");
		System.out.println("select option 1 to give her your real name, and option 2 to give her a fake name \n");

		int option = scanner.nextInt();

		switch (option) {
			case 1:
				System.out.println("you chose option 1 and decided to give her your real name");
				if (!witchKeyTaken) {
					System.out.println("the witch uses her magic wand to produce a key and gives it to you with her blessing");
					witchKeyTaken = true;
					keys++;
					System.out.println("\n");
					pageOne(args);
				}
				else {
					System.out.println("\f hello " + new String[]{userName});
					System.out.println("the witch has already given you a key. you wil return to the forest now");
					System.out.println("\n");
					pageOne(args);
				}
			case 2:
				System.out.println("you chose option 2 and decided to give her a fake name");
				System.out.println("the witch can tell you are lying. you'll wake up and remember nothing");
				System.out.println("\n");
				pageZero(args);
		}



	}
//    PAGE4
//        Inside the castle you see two doors.
//        >>> Prompt the user for a 1,2 or 3
//        1. Blue door (GOTO PAGE5)
//        2. Red door (GOTO PAGE6)
//        3. Return to crossroads
	public static void pageFour(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("inside the castle you see two doors");
		System.out.println("what do you choose?");
		System.out.println("select option 1 for the blue door and option 2 for the red door");
		System.out.println("select option 3 to return to the crossroads");

		int option = scanner.nextInt();

		switch (option) {
			case 1:
				System.out.println("you chose the blue door");
				System.out.println("\n");
				pageFive(args);
			case 2:
				System.out.println("you chose the red door");
				System.out.println("\n");
				pageSix(args);
			case 3:
				System.out.println("you chose option 3, returning to the crossroads");
				System.out.println("\n");
				pageOne(args);

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
	public static void pageFive(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("you see a locked blue door with 3 keyholes");

		if (keys == 3) {
			System.out.println("you have 3 keys");
			System.out.println("\n");
			goodEnd(args);
		} else {
			System.out.println("the door is locked and requires 3 keys");
			System.out.println("you leave to find more keys");
			System.out.println("\n");
			pageFour(args);
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
	public static void pageSix (String[] args) {
		System.out.println("you find the red door is unlocked");
		if (!redRoomKeyTaken) {
			System.out.println("you found a key!");
			keys++;
			System.out.println("\n");
		}
		else {
			System.out.println("you've already collected a key from here");
			System.out.println("\n");
			pageFour(args);
		}
		System.out.println("you feel like you've searched this room thoroughly");
		System.out.println("you leave the room and continue searching the castle");
		System.out.println("\n");
		pageFour(args);

	}
//
//    BADEND
//        You have failed in your quest.
//        Would you like to try again?
//        >>> Prompt 1 or 2
//        1. Yes. (GOTO START)
//        2. No. (End Game)
	public static void badEnd (String[] args) {
		System.out.println("you have failed your quest. would you like to try again? press 1 for yes and 2 to exit");
		Scanner scanner = new Scanner(System.in);

		int option = scanner.nextInt();


		switch (option) {
			case 1:
				System.out.println("restarting game");
				System.out.println("\n");
				pageZero(args);
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
	public static void goodEnd (String[] args) {
		System.out.println("inside the blue door you find endless treasure, and you are set for life. congrats!");
		System.out.println("would you like to play again? press 1 for yes and 2 to exit");
		Scanner scanner = new Scanner(System.in);

		int option = scanner.nextInt();

		switch (option) {
			case 1:
				System.out.println("restarting game");
				System.out.println("\n");
				pageZero(args);
				break;
			case 2:
				System.out.println("you chose to exit");
				System.exit(0);
		}
	}

}
