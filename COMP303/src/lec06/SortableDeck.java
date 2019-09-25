package lec06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import lec02.Rank;
import lec02.Suit;
import lec04.Card;


/**
 * A deck that can be sorted according to open-ended number of different 
 * sorting algorithm. However, once a deck is instantiated,
 * it is not possible to change the sorting signature
 * 
 *
 */
public class SortableDeck implements Sortable{
	private List<Card> aCards = new ArrayList<>();
	
	public SortableDeck() {
		shuffle();
	}
	
	public boolean isEmpty() {
		return aCards.isEmpty();
	}
	
	public void shuffle() {
		aCards.clear();
		for (Suit suit : Suit.values()) {
			for (Rank rank : Rank.values()) {
				aCards.add(new Card(rank,suit));;
			}
		}
		Collections.shuffle(aCards);
		
	}
	
	public Card draw() {
		assert !isEmpty();
		return aCards.remove(aCards.size()-1);
	}
	
	public class CardIterator implements Iterator<Card>{
		/*
		 * design pattern "ITERATOR"
		 * write a concrete iterator for better encapsulation
		 */
		private int index;
		
		public CardIterator() {
			index = 0;
		}

		@Override
		public boolean hasNext() {
			return index < aCards.size()-1;
		}

		@Override
		public Card next() {
			index++;
			return aCards.get(index);
		}
	}

	public Iterator<Card> iterator() {
		return new CardIterator();
	}
	
	private Comparator<Card> aComparator;
	public SortableDeck(Comparator<Card> pComparator) {
		//just pass different Comparator when initialize the SortableDeck
		 aComparator = pComparator;
		 shuffle();
	 }
	
	 public void sort() {
		 Collections.sort(aCards, aComparator);
	 }
	 

}
