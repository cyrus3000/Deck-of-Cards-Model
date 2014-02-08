/**
 * Created by Tat on 2/8/14.
 */
public class Tester {

	private static Shoe shoe;

	public static void main(String args[]) {
		shoe = new Shoe();
		Card[] cards = shoe.getShoe();
		for(int i = 0; i < cards.length; i++) {
			System.out.println(cards[i].getValue() + ", " + cards[i].getSuit());
		}
	}

}
