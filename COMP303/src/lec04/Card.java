package lec04;

import java.util.Comparator;

import lec02.Rank;
import lec02.Suit;

//use static factory method in card that creates object in comparator later so you can access the private field
public class Card implements Comparable<Card>{
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
	
	
	
	//followings are static factory methods
	public static Comparator<Card> createByRank(){
		return new Comparator<Card>() {

			@Override
			public int compare(Card o1, Card o2) {
				return o1.aRank.ordinal() - o2.aRank.ordinal();
			}
			
		};
	}
	
	public static Comparator<Card> createBySuit(){
		return new Comparator<Card>() {
			public int compare(Card o1, Card o2) {
				return o1.aSuit.ordinal() - o2.aSuit.ordinal();
			}
		};
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



	@Override
	public int compareTo(Card o) {
		return this.aSuit.ordinal() - o.aSuit.ordinal();
	}

	



}