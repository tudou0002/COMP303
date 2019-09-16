package lec04;
import lec03.Card;

public interface CardSource {
	/**
	 * Returns a card from a source
	 * 
	 * @return the next available card
	 * @pre !isEmpty()
	 */
	Card draw();
	
	/** 
	 * @return True if there is no cards in the source
	 */
	boolean isEmpty();

}
