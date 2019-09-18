package lec04;

import java.util.Comparator;
public class BySuitComparator implements Comparator<Card>{
	
	public int compare(Card pCard1, Card pCard2) {
//		return pCard1.aSuit.compareTo(pCard2.aSuit);   /* error since aSuit is a private field */
		return pCard1.getSuit().compareTo(pCard2.getSuit());
	}

}
