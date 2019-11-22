package strategy;

import java.util.Comparator;

//this is a separate class implementing Comparator
public class CompareByAcceptance implements Comparator<Problem>{

	@Override
	public int compare(Problem o1, Problem o2) {
		
		/*
		 * for ascending order: -1 if 1st<2nd
		 */
		if(o1.getAcceptance()<o2.getAcceptance()) return -1;
		else if(o1.getAcceptance()>o2.getAcceptance()) return 1;
		else return 0;
	}
	
}
