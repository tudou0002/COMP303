package lec09;

import java.util.Optional;

import lec07.Card;

public class CardViewer {
	private final Optional<Iterable<Card>> aCards;  //option2
	
	/**
	 * 
	 * @param pCards can be null
	 */
	public CardViewer(Iterable<Card> pCards) {
		aCards = Optional.ofNullable(pCards);
	}

	public void view() {
//		//option 1
//		if(aCards == null) {
//			System.out.println("no cards");
//			return;
//		}
		
//		//option 2
//		if ( !aCards.isPresent() ) {
//			System.out.println("no cards");
//		}
		
		//option 3
		if ( aCards.isNull()) {
			System.out.println("no cards");
		}
		for(Card card: aCards) {
			System.out.println(card.toString());
		}
	}
}
