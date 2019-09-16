package lec04;
import lec03.Card;;

public class Deck implements CardSource {
	/*
	 * implements:
	 * guarantee that instances of this class type will implement all the methods in interface
	 * create a subtype relationship
	 */
	
	public void shuffle() {};
	public Card draw() {};
	public boolean isEmpty() {};
	

}
