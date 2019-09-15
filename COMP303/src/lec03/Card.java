package lec03;

import lec02.Rank;
import lec02.Suit;

/*
 * "design by contract"
 * important to decide whether null is a valid input or not
 * if null is invalid, caller's fault
 * if null is valid and the program does something funny, programmer's fault
 */

public class Card {
	private Suit aSuit;
	private Rank aRank;
	
	/**
	 * Constructs a new Card with the specified Rank and Suit.
	 * @param pRank
	 * @param pSuit
	 * @pre pRank != null && pSuit != null
	 */
	
	public Card(Rank pRank, Suit pSuit) {
		assert pRank != null && pSuit != null;
		aSuit = pSuit;
		aRank = pRank;
		
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
