/**
 * Created by Tat on 2/8/14.
 */
public class Shoe {

	private final int NUMBER_OF_DECKS_IN_THE_SHOE;
	private final int NUMBER_OF_CARDS_IN_A_DECK = 52;
	private final int NUMBER_OF_CARDS_IN_THE_SHOE;
	private Card[] shoe;

	public Shoe() {
		this(8);
	}

	public Shoe(int numDecks) {
		NUMBER_OF_DECKS_IN_THE_SHOE = numDecks;
		NUMBER_OF_CARDS_IN_THE_SHOE = NUMBER_OF_DECKS_IN_THE_SHOE * NUMBER_OF_CARDS_IN_A_DECK;
		shoe = new Card[NUMBER_OF_CARDS_IN_THE_SHOE];
		createShoe();
	}

	private void createShoe() {
		// Creates the holder for all of the decks
		Deck[] decks = new Deck[NUMBER_OF_DECKS_IN_THE_SHOE];
		for(int i = 0; i < decks.length; i++) {
			decks[i] = new Deck();
		}

		int count = 0;

		// Adds cards from the decks to the shoe
		for(int i = 0; i < decks.length; i++) {

			// Gets the deck, then gets the cards from the deck
			Card[] cards = decks[i].getDeck();

			// Adds the cards retrieved from the deck to the shoe
			for(int j = 0; j < NUMBER_OF_CARDS_IN_A_DECK; j++) {
				shoe[count] = cards[j];
				count++;
			}
		}
	}

	public Card[] getShoe() {
		return shoe;
	}

}
