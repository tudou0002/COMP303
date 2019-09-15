package lec03;

import java.util.*;

public class Game {
	
	private Game() {};
	
	public static void main(String[] args) {
		
		/*
		 *One idea is to use a different int to represent each possible set of cards.
		 *in R, c52 <- function(x) factorial(52)/factorial(52-x) to calculate the possibilities.
		 *possible but not acceptable
		 */
		
		/*
		 *easily corrupted,may be modified without intention
		 *deck should not bind to ArrayList
		 *if changes the name to foo, code will be hard to understand
		 */
		
//		List<Card> deck = new ArrayList<>();
//		for (Suit suit : Suit.values()) {
//			for (Rank rank : Rank.values()) {
//				deck.add(new Card(rank,suit));;
//			}
//		}
//		Collections.shuffle(deck);
//		System.out.println(Arrays.toString(deck.toArray()));
		
		Deck deck1 = new Deck();
		Deck deck2 = new Deck();
//		deck.aCards;		/*error if aCards is private */
		
		System.out.println(deck1.getCard(51).toString());
		System.out.println(deck2.getCard(51).toString());
		
		Deck deck3 = new Deck(deck2);
		
		System.out.println(deck3.ofSameSize(deck2));
		System.out.println(deck3.getCard(51).toString());
		List<Card> deck4 = deck3.getCards();
		deck4.remove(1);
		
		
		
	}
	

}
