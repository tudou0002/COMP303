package strategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * "Problems" aggregates Problem, and can be sorted by Id/Acceptance/difficulty/
 */

public class Problems {
	
	private final List<Problem> aAll;
	
	public Problems() {
		aAll = new ArrayList<>();
	}
	
	public Problems(List<Problem> pAll) {
		aAll = new ArrayList<>(pAll);
	}
	
	// usage of var args here
	public void add(Problem ...problems) {
		for(Problem p : problems) {
			aAll.add(p);
		}
	}
	
	public void sortId(){
		
		//an anonymous class since the comparator is only used for once
		Collections.sort(aAll, new Comparator<Problem>() {

			@Override
			public int compare(Problem o1, Problem o2) {
				return (o1.getId()-o2.getId());
			}
			
		});
	}
	
	public void sortAcceptance() {
		
		//a separate class, initialize an instance before use it
		CompareByAcceptance c = new CompareByAcceptance();
		Collections.sort(aAll, c);
	}
	
	public static class ByDifficulty implements Comparator<Problem>{

		@Override
		public int compare(Problem o1, Problem o2) {
			
			//the default .compareTo() of enum type comparing the ordering which the constants are declared
			return o1.getDifficulty().compareTo(o2.getDifficulty());
		}
		
	}
	
	public void sortDifficulty() {
		ByDifficulty d = new ByDifficulty();
		Collections.sort(aAll, d);
	}
	
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		for(Problem p : aAll) {
			sb.append(p.toString());
			sb.append("\n");
		}
		return sb.toString();
		
	}

}
