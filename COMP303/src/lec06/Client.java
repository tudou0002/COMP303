package lec06;

import lec05.Card;

public class Client {
	public static void main(String[] args) {
		printAll(new Deck());
	}
	
	public static void printAll(Iterable<Card> pCards) {
		for( Card card:pCards) {
			System.out.println(card);
		}
		/* 
		 * followings are what happened behind the enhanced loop
		 *Iterator<Card> iterator = pCards.iterator();
		 *while(iterator.hasNext()) {
		 *	Card element = iterator.next();
		 *}
		 **/
	}

}
