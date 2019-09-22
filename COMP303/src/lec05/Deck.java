package lec05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import lec02.Rank;
import lec02.Suit;
import lec04.Card;


public class Deck implements Iterable<Card>{

	private List<Card> aCards = new ArrayList<>();
	
	public Deck() {
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
	
//	public Iterator<Card> iterator()
//	{
//		//anonymous class which we don't know the name of the class that implement List.iterator
//		return aCards.iterator();
//	}
	
	public Iterator<Card> iterator() {
		return new CardIterator();
	}

}
