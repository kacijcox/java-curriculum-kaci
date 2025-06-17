package sets;

import java.util.*;

public class Dealer {

	Set<Card> deck = new HashSet<>();
	Map<String, ArrayList<Card>> players = new HashMap<>();

	public Dealer() {
		String[] suits = {"spade", "club", "heart", "diamond"};
		String[] ranks = {"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};

		for (String suit : suits) {
			for (String rank : ranks) {
				deck.add(new Card(suit, rank));
			}
		}
	}

	public void deal(String playerName) {
		if (deck.size() < 5) {
			System.out.println("not enough cards left in deck");
			return;
		}

		players.put(playerName, new ArrayList<Card>());

		ArrayList<Card> deckList = new ArrayList<>(deck);

		for (int i = 0; i < 5; i++) {
			Card card = deckList.get(i);
			deck.remove(card);
			players.get(playerName).add(card);
		}
	}
	public void printHands() {
		for(Map.Entry<String, ArrayList<Card>> entry : players.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}

}

