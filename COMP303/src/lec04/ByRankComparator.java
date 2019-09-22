package lec04;

import java.util.Comparator;
//function objects
public class ByRankComparator implements Comparator<Card>{
	public int compare(Card pCard1,Card pCard2) {
		return pCard1.getRank().compareTo(pCard2.getRank());
	}
	/*
	 * In the case where we don't have getters:
	 * 1. declare the comparator as nested class
	 * 2. define class as anonymous class
	 * 3. use lambda expressions
	 */
}


