package lec05;

public class Client {
	
	public static void main(String[] args) {
		Deck deck = new Deck();
//		showAll(deck.iterator());
		
		for(lec04.Card card : deck) {
			System.out.println(card.toString());
		}
		System.out.println();
		for(lec04.Card card : deck) {
			System.out.println(card.toString());
		}
		
		
	}
	
//	private static void showAll(Iterator<Card> cards) {
//		// cannot iterate twice
//		while( cards.hasNext()) {
//			System.out.println(cards.next());
//		}
//	}

}
