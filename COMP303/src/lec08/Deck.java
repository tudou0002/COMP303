package lec08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import lec02.Rank;
import lec05.Suit;
import lec07.Card;

public class Deck implements Iterable<Card>{
	private final List<Card> aCards = new ArrayList<>();
	private Undoer aUndoer = new Undoer();
	
	private void initialize() {
		aCards.clear();
		for (Suit suit : Suit.values()) {
			for (Rank rank : Rank.values()) {
				aCards.add(Card.get(rank,suit));;
			}
		}
	}
	
	public boolean isEmpty() {
		return aCards.isEmpty();
	}
	
	
	public Card draw() {
		assert !isEmpty();
		Card card =  aCards.remove(aCards.size()-1);
		aUndoer.hasDrawn(card);
		return card;
	}

	
	class Undoer{
		//Since ArrayList is mutable, make it final doesn't mean you cannot change the content later
		private ArrayList<Card> aStoredCards = new ArrayList<>();
		//an inner class without the static keyword has an invisible field 
		//which includes the instances of the parent class
		
		public void reset() {
			aStoredCards.clear();
		}
		
		public void hasDrawn(Card pCard) {
			aStoredCards.add(pCard);
		}
		
		public boolean canUndo() {
			return !aStoredCards.isEmpty();
		}
		
		public void undo() {
			assert canUndo();
			//reveals the relationship between Deck and Undoer
			Deck.this.aCards.add(aStoredCards.remove(aStoredCards.size()-1));
			//Deck.this.aCards refers to the secret field of the outer class instances
		}
	}
	
	public void undo() {
		
	}
	
	public void shuffle() {
		aUndoer.reset();
		initialize();
		Collections.shuffle(aCards);
	}

	@Override
	public Iterator<Card> iterator() {
		return Collections.unmodifiableList(aCards).iterator();
	}

}
