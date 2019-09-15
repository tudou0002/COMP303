package lec02;

import java.util.ArrayList;
import java.util.List;

/* 
 * this class is not created in class demo
 */
public class Deck {
	
	public List<Card> aCards = new ArrayList<>();
	
	public Deck() {
		for (Suit suit : Suit.values()) {
			for (Rank rank : Rank.values()) {
				aCards.add(new Card(rank,suit));;
			}
		}
	}

}
