package lec04;

import lec02.Rank;
import lec02.Suit;

public class Card implements Comparable<Card> {
	private Suit aSuit;
	private Rank aRank;
	
	public Card(Rank pRank, Suit pSuit) {
		assert pRank != null && pSuit != null;
		aSuit = pSuit;
		aRank = pRank;
	}
	
	public int compareTo(Card pCard) {
		return aRank.compareTo(pCard.aRank);
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