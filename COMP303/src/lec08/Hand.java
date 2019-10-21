package lec08;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import lec02.Rank;

public class Hand implements Iterable<Card>{
	
	private List<Card> aCards = new ArrayList<>();
	private int aMaxSize;
	
	public Hand(int pMaxSize) {
		aMaxSize = pMaxSize;
	}
	
	public boolean isFull() {
		return aCards.size() ==aMaxSize;
	}
	
	public void add(Card pCard) {
		assert !isFull();
		aCards.add(pCard);
	}
	
	public static Comparator<Hand> createByRankComparator(Rank pRank){
		return new Comparator<Hand>() {

			@Override
			public int compare(Hand o1, Hand o2) {
				return countRank(o1) - countRank(o2);
			}
			//we have access to the parameter pRank in the method in this anonymous class 
			//gives you a copy of reference of the parameter pRank
			//object capture
			
			private int countRank(Hand pHand) {
				int total = 0;
				for( Card card : pHand) {
					if (card.getRank() == pRank) {
						total++;;
					}
				}
				return total;
			}
		};
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
	
	@Override
	public Iterator<Card> iterator() {
		return new CardIterator();
	}

}
