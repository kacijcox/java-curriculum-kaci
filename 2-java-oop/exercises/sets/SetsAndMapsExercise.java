package sets;

public class SetsAndMapsExercise {
	public static void main(String[] args) {

		Dealer dealer = new Dealer();

		dealer.deal("alice");
		dealer.deal("bob");
		dealer.deal("charlie");

		dealer.printHands();

		Card card1 = new Card("spade", "ace");
		Card card2 = new Card("spade", "ace");
		System.out.println("cards equal: " + card1.equals(card2));

		for(int i = 1; i <= 10; i++) {
			dealer.deal("player" + i);
		}

	}
}
