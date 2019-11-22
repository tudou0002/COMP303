package strategy;

/*
 * Problem class could implements Comparable, but in that case, switching sort strategy will become
 * complicated. So instead, we let Problems(the class aggregates Problem) to implement Comparator. 
 * We then are able to use Collections.sort(List, Comparator) to sort by clients preference.
 */

public class Problem {
	
	private final int aId;
	private final String aName;
	private double aAcceptance;
	private Difficulty aDifficulty;
	
	public Problem(int pId, String pName, double pAcceptance, Difficulty pDifficulty) {
		
		aId = pId;
		aName = pName;
		aAcceptance = pAcceptance;
		aDifficulty = pDifficulty;
	}
	
	public int getId() {
		return aId;
	}
	
	public double getAcceptance() {
		return aAcceptance;
	}
	
	public Difficulty getDifficulty() {
		return aDifficulty;
	}
	
	public String toString() {
		return "#" + aId + "  " + aName + "  " + aAcceptance + "%  " + aDifficulty;
	}


	
	
	

}
