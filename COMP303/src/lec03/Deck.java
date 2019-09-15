package lec03;

import java.util.*;

import lec02.Rank;
import lec02.Suit;

public class Deck {
	/*
	 * public is bad for encapsulation
	 * class scope is not same as object scope
	 */
	private List<Card> aCards = new ArrayList<>();
	
	/**
	 * Constructs a new Deck by shallow copying a given Deck. Works fine if aCards is immutable.
	 * @param pDeck
	 */
	public Deck (Deck pDeck) {
		this.aCards = new ArrayList<>(pDeck.aCards);
	}
	
//	public Deck(Deck pDeck)
//	{
//		//mutable:need deep copy
//		aCards = new ArrayList<>();
//		for( Card card : pDeck.aCards ) {
//			aCards.add(new Card(card));
//		}
//	}
	
//	/**
//	 * Constructs a new Deck by shallow copying a given list. Reveals the implementation in client code.
//	 * @param pCards
//	 */
//
//	public Deck(List<Card> pCards ) {	
//		aCards = new ArrayList<>(pCards);
//		}
	
	/**
	 * Constructs a new randomly ordered Deck.
	 */
	public Deck() {
		shuffle();
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
	
//	/**
//	 * Removes the last Card in a deck. Makes the Deck a mutable object.
//	 * @return the Card previously at the end of a deck
//	 * @pre !isempty()
//	 */
//	public Card draw() {
//		return aCards.remove(aCards.size()-1);
//	}
	
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
	
//	public List<Card> getCards2() { 
//		return new ArrayList<>(aCards);
//	};
	
//	public static void main(String[] args) {
//		System.out.println(new Deck());
		
	/*
	 * Some insights on scope:
	 * the following two a are not in the same scope
	 * {int a = 0;}
	 * a=0;
		
	 * Deck deck1 = new Deck();
	 * Deck deck2 = new Deck();
	 * deck1.ofSameSize(deck2);
	 * 
	 * deck1 is the implicit variable, deck2 is the argument that pass to the method
	 * 
	 */
				
		
	}


