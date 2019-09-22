package lec05;

public class Client {
	
	public static void main(String[] args) {
		Deck deck = new Deck();
		showAll(deck.getCardIterator());
	}
	
	private static void showAll(Iterator<Card> cards) {
		// cannot iterate twice
		while( cards.hasNext()) {
			System.out.println(cards.next());
		}
	}

}
