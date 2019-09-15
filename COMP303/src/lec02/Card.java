package lec02;

public class Card {

	/*
	 *simple naming trick:
	 *a stands for attribute
	 *p stands for parameter
	 **/
	
	/*
	 *private int aId;
	 *we discard this attribute for information hiding purpose
	 */
	private Suit aSuit;
	
	public Suit getSuit() {
		return aSuit;
	}
	
	private Rank aRank;

	public Rank getRank() {
		return aRank;
	}
	
	public Card(Rank pRank, Suit pSuit) {
		/* to avoid null since enum can be null */
		if(pRank == null || pSuit == null) {
			throw new IllegalArgumentException("Try Again!");
		}
		aSuit = pSuit;
		aRank = pRank;
		
	}
	
	public String toString() {
		return aSuit.toString() + " of "+ aRank.toString();
	}
	
//	public static void main(String[] args) {
//		Card c = new Card(Rank.ACE, Suit.CLUBS);
//		System.out.println(c.toString());
//	}
}
