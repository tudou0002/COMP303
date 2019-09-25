package lec06;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import lec05.Card;
import lec02.Suit;

public class Hand {
	//create a factory method that create a comparator and compare number of suit of two hands
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
	/**
	 * create a comparator that compares hands based on the number
	 * of cards of a certain suit that are in  the hand, where the suit 
	 * is specified as an input
	 * @return
	 */
	//if we want to store pSuit, whether to store it in instance/local/global variable
	
	//factory method goes here
	public Comparator<Hand> createComparatorForSuit(Suit pSuit){
		return new HandComparator(pSuit);
	}
	
	private static class HandComparator implements Comparator<Hand>{
		/*the nested class can give access to private field*/
		private Suit aSuit;
		
		public HandComparator(Suit pSuit) {
			aSuit = pSuit;
		}
		
		public int compare(Hand pHand1, Hand pHand2) {
			//count the number of cards in pHand1 of suit aSuit
			//count the number of cards in pHand2 of suit aSuit
			//return the difference 
			return count(pHand1)-count(pHand2);
		}
		
		private int count(Hand pHand) {
			int total = 0;
			for (Card card : pHand.aCards) {
				//class can contain class, to be able to access the private field
				if(card.getSuit() ==aSuit) {
					total++;
				}
			}
			return total;
		}

	}

}
