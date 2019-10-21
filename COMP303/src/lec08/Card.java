package lec08;

import java.util.Comparator;
import java.util.Optional;
import lec05.Suit;
import lec02.Rank;


public class Card {
	private Optional<Suit> aSuit = Optional.empty();
	private Optional<Rank> aRank = Optional.empty();
	private boolean aIsJoker = false;
	private static Card JOKER = new Card();
	
	public boolean isJoker() {
		return aIsJoker;
	}
	
	private Card(Rank pRank, Suit pSuit) {
		aRank = Optional.of(pRank);
		aSuit = Optional.of(pSuit);		
	}
	
	private Card() {
		aIsJoker = true;
	}
	
	public static Card getJoker() {
		//violate the fly-weight (we could create more than one joker)
		return JOKER;
	}
	
	//aRank is an implicit field that refers to the instance of the outer class
	//pCard is a parameter of the compareTo method
	
	public static Comparator<Card> comparator(){
		class MyComparator implements Comparator<Card>{

			@Override
			public int compare(Card o1, Card o2) {
				return o1.getRank().compareTo(o2.getRank());
			}
			
		};
		
		return new MyComparator();
	}
	
	
	public int compareTo(Card pCard) {
		return aSuit.get().compareTo(pCard.aSuit.get());
	}
	
	
	public String toString() {
		return aSuit.toString() + " of "+ aRank.toString();
	}
	
	public Suit getSuit() {
		return aSuit.get();
	}
	
	public Rank getRank() {
		return aRank.get();
	}
	

}
