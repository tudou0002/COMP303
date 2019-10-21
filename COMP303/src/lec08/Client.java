package lec08;

import lec02.Rank;

import lec05.Suit;

public class Client {
	public static void main(String[] args) {
		Card card = Card.get(Rank.ACE, Suit.CLUBS);
		Comparable<Card> comparable = card.comparable();
		
		for(Card card1: new Deck()) {
			System.out.println(comparable.compareTo(card1))
		}
	}

}
