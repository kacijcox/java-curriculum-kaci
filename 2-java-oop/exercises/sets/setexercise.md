## 1. Create a SetsAndMapsExercise class
* This is where you will demonstrate the use of all the other objects and classes you create in this exercise
* Should have a public static void main()

## 2. Create a Card class
* Properties:
    * String suit - (Spade, Club, Heart, Diamond)
    * String rank - (Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10, Jack, Queen, King)
* Methods:
    * constructor - Card(Card suit, String rank)
    * toString() - pretty print the value of this card
    * equals() - a card should be equal to this card if it has the same suit and rank
    * hashcode() - a card should have the same hashcode of this card if it has the same suit and rank

## 3. Create a Dealer class
* Properties:
    * Set<Card> deck - deck of 52 cards, Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10, Jack, Queen, King for Spade, Club, Heart, Diamond
    * Map<String, ArrayList<Card> players - a map where the key is a player's name and the value is an ArrayList of cards
* Methods:
    * constructor - Dealer() initializes a set of deck of 52 cards
    * void deal(String playerName)
        * initialize a Player with the name passed as a parameter
        * remove 5 cards from your deck and add them to the Player's ArrayList of cards
        * add them to the map of Players
        * don't deal to a new Player if there aren't enough cards left in the deck, instead print an error message to the console.
    * printHands() - prints all the Player's names and their cards 
