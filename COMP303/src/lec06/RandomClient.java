package lec06;

import lec04.CardSource;
import lec05.Card;

public class RandomClient {
	
	public static void shuffleSomething(Sortable pSortable) {
		pSortable.sort();
		System.out.println("I've sorted");
	}
	
	public static void doSomething(CardSource pSource) {
		//after you draw a card, you want to iterate 
		//bad: cast to iterable: if you pass something which is not iterable
		// you will have wrong cast type exception
		lec04.Card card = pSource.draw();
		for( Card element : (Iterable<Card>)pSource) {
			System.out.println(element);
		}
	}
}
