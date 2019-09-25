package lec07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import lec02.Rank;

import lec05.Suit;


public class Deck {
	private List<Card> aCards = new ArrayList<>();
	
	private void initialize() {
		aCards.clear();
		for (Suit suit : Suit.values()) {
			for (Rank rank : Rank.values()) {
				aCards.add(Card.get(rank,suit));;
			}
		}
	}
	
	public boolean isEmpty() {
		return aCards.isEmpty();
	}
	
	public void shuffle() {
		initialize();
		Collections.shuffle(aCards);
	}
	
	public Card draw() {
		assert !isEmpty();
		return aCards.remove(aCards.size()-1);
	}

}
