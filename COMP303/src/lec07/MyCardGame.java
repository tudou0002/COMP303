package lec07;

import lec02.Rank;
import lec05.Suit;

public class MyCardGame {
	public static void main(String[] args) {
		Card card1 = Card.get(Rank.ACE, Suit.CLUBS);
		Card card2 = Card.get(Rank.ACE, Suit.CLUBS);
		System.out.println(card1==card2);
	}

}
