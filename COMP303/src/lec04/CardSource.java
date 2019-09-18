package lec04;

//important to write documentation

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
