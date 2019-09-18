package lec04;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import lec02.Rank;
import lec02.Suit;
public class Deck implements CardSource {
	/*
	 * 'implements' key word:
	 * guarantee that instances of this class type will implement all the methods in interface
	 * create a sub-type relationship
	 *
	 */
	
	private List<Card> aCards = new ArrayList<>();
	
	/**
	 * Constructs a new Deck by shallow copying a given Deck. Works fine if aCards is immutable.
	 * @param pDeck
	 */
	public Deck (Deck pDeck) {
		this.aCards = new ArrayList<>(pDeck.aCards);
	}
	
	/**
	 * Constructs a new randomly ordered Deck.
	 */
	public Deck() {
		shuffle();
	}
	
	/**
	 * using an anonymous class to sort
	 */
	public void sort1() {

		/*anonymous class: an inner class without a name and for which only a single object is created */
		Collections.sort(aCards, new BySuitComparator() {
			public int compare(Card pCard1, Card pCard2) {
				return pCard1.getSuit().compareTo(pCard2.getSuit());
				/*works since we have a getter to get suit
				 *anonymous class: works for tiny implementation
				 *the code defined is in the same position you need it, return an object
				 *now, pretend we don't have getters
				 */
			}
		}
		);
	}
	
	/*Not sure what this code is for*/
//	public void sort2() {
//		Collections.sort(aCards, new Card(Rank.ACE, Suit.SPADES));
//		
//	}
	
	/**
	 * Already define a BySuitComparator class in another file. 
	 * Create a new instance to sort.
	 */
	public void sort2() {
		Comparator<Card> bySuit = new BySuitComparator();
		Collections.sort(aCards, bySuit);
	}
	
	/**
	 * Sort by rank
	 */
	public void sort4() {
		Comparator<Card> byRank =new ByRankComparator();
		Collections.sort(aCards, byRank);
	}
	
	/**
	 * Sorts aCards by Suit. Card implements comparable .
	 * Things can get nasty when tries to switch cases between sortBySuit and sortByRank
	 */
	public void sort3() {
		Collections.sort(aCards);
		
	}
	
	public void shuffle() {
		aCards.clear();
		for (Suit suit : Suit.values()) {
			for (Rank rank : Rank.values()) {
				aCards.add(new Card(rank,suit));;
			}
		}
		Collections.shuffle(aCards);
		
	}
	

	/**
	 * Returns the Card at the specified position in a deck
	 * @param pCardIndex the index of the Card
	 * @return the Card in the specified position
	 */
	public Card getCard(int pCardIndex) {
		return aCards.get(pCardIndex);
	}
	
	/**
	 * Returns true if the Deck contains no cards.
	 * @return true if the Deck contains no cards
	 */
	public boolean isEmpty()
	{
		return aCards.isEmpty();
	}

	/**
	 * 
	 * @param deck
	 * @return true if two decks have the same size
	 */
	public boolean ofSameSize(Deck deck) {
		/*
		 * "this" refers to the instance which calls the method
		 * "deck" refers to the parameter
		 * scope is about in which class you place the code, private is relative
		 */
		return this.aCards.size() == deck.aCards.size();
		
	}
	
	/**
	 * Returns an immutable access to the aCards. 
	 * Returns UnsupportOperationException if tries to modify the list.
	 * @return an immutable 
	 */
	public List<Card> getCards() {
		return Collections.unmodifiableList(aCards);
	}
	
	@Override
	public String toString() {
		return aCards.toString();
	
	}

	/**
	 * Draws a card from the deck and removes the card from the deck.
	 * @return The card drawn.
	 * @pre !isEmpty()
	 */
	public Card draw()
	{
		assert !isEmpty();
		return aCards.remove(aCards.size()-1);
	}

}
