package lec04;

import lec02.Rank;
import lec02.Suit;

//use static factory method in card that creates object in comparator later so you can access the private field
public class Card implements Comparable<Card> {
	private Suit aSuit;
	private Rank aRank;
//	private boolean bySuit;
	/*
	 * Switch statement:
	 * define a flag to handle cases which different sorting strategies is needed
	 * see compareTo(Card pCard) method below
	 * Better: move the comparison code to a separate object supported by Comparator<T> interface
	 */
	
	public Card(Rank pRank, Suit pSuit) {
		assert pRank != null && pSuit != null;
		aSuit = pSuit;
		aRank = pRank;
	}
	
	@Override
	/*
	 *Overriding is a feature that allows a subclass or child class 
	 *to provide a specific implementation of a method that is already provided 
	 *by one of its super-classes or parent classes
	 */
	public int compareTo(Card pCard) {
		return aSuit.ordinal() - pCard.aSuit.ordinal();
		
	}
	
	/*
	 * this is the case where you want to sort between suit and rank
	 * but card only implements Comparable
	 */
//	public int compareTo(Card pCard) {
//		return aSuit.compareTo(pCard.aSuit); //enum is a subtype of comparable
//		if(bySuit) then {
//			
//		} else {
//			//how to change the bysuit value?
//			//setter OR set by constructor
//			//end with a disgusting mess
//		}
//	}
	
	public String toString() {
		return aSuit.toString() + " of "+ aRank.toString();
	}
	
	public Suit getSuit() {
		return aSuit;
	}
	
	public Rank getRank() {
		return aRank;
	}

	



}