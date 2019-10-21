package ch2.exercise;

import java.util.Collections;

public class Card {
	/*
	 * Exercise 1:
	 * use different combination of boolean to represent each card. Two for suit, the rest six are 
	 * for rank.
	 */
	private boolean color;	//true is red, false is black
	private boolean suit; 	//true are diamonds or clubs, false are hearts or spades
	private boolean rank1;	//true: first six cards
	private boolean rank2;	//true: first three cards
	private boolean rank3;	//true: first two cards
	private boolean rank4;	//true: first card
	/*
	 * Impact on Container: complex and error-prone
	 * Impact on User: None
	 */
	
	
	/*
	 * Exercise 2:
	 * Implement Card as a single enum type can bring difficulties on specifying Suit and rank. 
	 * However, enum type can be easily compared, and it's immutable.
	 */

	
	/*
	 * Exercise 3:
	 * See lec02.Suit.java
	 */
	
	/*
	 * Exercise 4 & 5:
	 * Add "Joker" as an enum type. getRank() of a Joker is Joker, getSuit() of a Joker is high/low.
	 */
	
	/*
	 * Exercise 6:
	 * return return Collections.unmodifiableList(aCards);
	 */
	
	/*
	 * Exercise 7:
	 * 
	 */
}
