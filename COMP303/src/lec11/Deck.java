package lec11;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import lec02.Rank;

import lec05.Suit;
import lec07.Card;


public class Deck implements Iterable<Card>{
	private List<Card> aCards = new ArrayList<>();
	private final Comparator<Card> aComparator;
    
	public Deck() {
		aComparator = null;
		shuffle();
	}
	
	public Deck(Comparator<Card> pComparator) {
		aComparator = pComparator;
		shuffle();
	}
	
	
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
	
	public boolean hasOnlyDiamondFaceCards() {
		if( isEmpty() ) return false;
		for(Card card : aCards) {
			if( card.getSuit() != Suit.DIAMONDS ||
					card.getRank().ordinal() < Rank.JACK.ordinal()) {
				return false;
			}
		}
		return true;
	}
	
	public Card draw() {
		assert !isEmpty();
		return aCards.remove(aCards.size()-1);
	}
	
	public void sort() {
		aCards.sort(aComparator);
	}

	@Override
	public Iterator<Card> iterator() {
		return aCards.iterator();
	}

}