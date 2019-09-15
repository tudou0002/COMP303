package lec02;

import java.util.*;
import java.util.List;
import java.util.ArrayList;


public class Client {
			
	public static void main(String[] pArgs) {
	
		/* design a deck of cards */
		List<Card> deck = new ArrayList<>();
		for (Suit suit : Suit.values()) {
			for (Rank rank : Rank.values()) {
				deck.add(new Card(rank,suit));;
			}
		}
		Collections.shuffle(deck);
		
//		easy to confuse at this point, change to create a new class
//		more easily understand
			
	}
	
	
}