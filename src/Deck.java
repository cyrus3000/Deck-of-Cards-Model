/**
 * Created by Tat on 2/8/14.
 */
public class Deck {

	private final int NUMBER_OF_CARDS_IN_A_DECK = 52;
	private final int NUMBER_OF_SUITS_IN_A_DECK = 4;
	private final int NUMBER_OF_VALUES_IN_A_DECK = 13;
	private Card[] deck;

	public Deck() {
		deck = new Card[NUMBER_OF_CARDS_IN_A_DECK];
		createDeck();
	}

	private void createDeck() {
		int count = 0;
		// i represents the number of values in a deck
		for(int i = 1; i <= NUMBER_OF_VALUES_IN_A_DECK; i++) {
			// j represents the number of suits in a deck
			for(int j = 0; j < NUMBER_OF_SUITS_IN_A_DECK; j++) {
				String suit;
				switch(j) {
					default:
						suit = "";
						break;
					case 0:
						suit = "Hearts";
						break;
					case 1:
						suit = "Diamonds";
						break;
					case 2:
						suit = "Clubs";
						break;
					case 3:
						suit = "Spades";
						break;
				}
				deck[count] = new Card(i, suit);
				count++;
			}
		}
	}

	public Card[] getDeck() {
		return deck;
	}

}
