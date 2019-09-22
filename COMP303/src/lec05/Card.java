package lec05;

import lec02.Rank;
import lec02.Suit;

public class Card implements Comparable<Card>{
	private Suit aSuit;
	private Rank aRank;
	
//	private static Comparator<Card> byRankComparator = new Comparator<Card>;
//	
//	
	
	public Card(Rank pRank, Suit pSuit) {
		assert pRank != null && pSuit != null;
		aSuit = pSuit;
		aRank = pRank;
	}
	
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
	
	
}
