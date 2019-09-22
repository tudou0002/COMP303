package lec05;

import lec02.Rank;
import lec02.Suit;
import lec04.Card;

public class Card implements Comparable<Card>{
	private Suit aSuit;
	private Rank aRank;
	
	private static Comparator<Card> byRankComparator = new Comparator<Card>;
	
	

	
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
	
	public String toString() {
		return aSuit.toString() + " of "+ aRank.toString();
	}
	
	public Suit getSuit() {
		return aSuit;
	}
	
	public Rank getRank() {
		return aRank;
	}
	
	public static Comparator<Card> getByRankComparator(){
		return BY_RANK_COMPARATOR;
	}
}
