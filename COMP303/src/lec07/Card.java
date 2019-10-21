package lec07;

import lec05.Suit;
import lec02.Rank;

public class Card {
	
	private final Suit aSuit;
	private final Rank aRank;
	
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
	
//	public boolean equals(Object pObject) {
//		if( pObject == this ) return true;
//		if ( pObject == null) return false;
//		if ( pObject.getClass() != getClass() ) return false;
//		//read the doc for getClass()
//		Card card = (Card) pObject;
//		return aRank == card.aRank  && aSuit == card.aSuit;
//	}
//	
//	//if the two object are equal, they HAVE to have the same hashcode
//	public int hashCode() {
//		return toString().hashCode();
//	}
	
	//to make the card unique now
	//first, we need to make constructor private
	//fly-weight  has to be immutable
	
//	private static final Card[] CARDS = new Card[Suit.values().length *13 + Rank.values().length];
//	static {
//		//this is a pre-initialized version
//		//use lazy-initialization when the number of unique object are huge
//		for(Suit suit : Suit.values()){
//			for (Rank rank : Rank.values()) {
//				CARDS[suit.ordinal()*13 + rank.ordinal()] = new Card(rank, suit);
//			}
//		}
//	}
//	
//	private Card(Rank pRank, Suit pSuit) {
//		assert pRank != null && pSuit != null;
//		aRank = pRank;
//		aSuit = pSuit; 
//	}
//	
//	public static Card get(Rank pRank, Suit pSuit) {
//		//this is a factory method to replace the constructor
//		return CARDS[pSuit.ordinal() *13 + pRank.ordinal()];
//	}
	
	//now we use lazy-initialization
	private static final Card[] CARDS = new Card[Suit.values().length*13+Rank.values().length];
	
	private Card(Rank pRank, Suit pSuit) {
		assert pRank != null && pSuit !=null;
		aRank=pRank;
		aSuit = pSuit;
	}
	
	public static Card get(Rank pRank, Suit pSuit) {
		if (CARDS[pSuit.ordinal()*13+pRank.ordinal()] ==null){
			CARDS[pSuit.ordinal()*13+pRank.ordinal()] = new Card(pRank, pSuit);
		}
		return CARDS[pSuit.ordinal()*13+pRank.ordinal()];
	}

}
