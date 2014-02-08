import java.util.Collections;
import java.util.Random;

/**
 * Created by Tat on 2/8/14.
 */
public class Dealer {

	private final int NUMBER_OF_DECKS_IN_THE_SHOE = 8;
	private Card[] shoe;

	// Dealer manages everything with cards. Essentially is the "Cards/Deck/Shoe Manager"/
	public Dealer() {
		shoe = new Shoe(NUMBER_OF_DECKS_IN_THE_SHOE).getShoe();
	}

	public void shuffle(Card[] cards) {
		Random r = new Random();
		for(int i = cards.length - 1; i > 0; i--) {
			int index = r.nextInt(i + 1);

			Card one = cards[index];
			cards[index] = cards[i];
			cards[i] = one;
		}
	}

}
