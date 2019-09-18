package lec04;

import java.util.Comparator;

public class ByRankComparator implements Comparator<Card>{
	public int compare(Card pCard1,Card pCard2) {
		return pCard1.getRank().compareTo(pCard2.getRank());
	}
}


