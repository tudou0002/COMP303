package strategy;


/*
 * Happy leetcoding :)
 * right now it can only be sorted in a ascending order, how can I change it to a double way?
 */
public class Client {
	
	private final static Problem PROBLEM1 = new Problem(1,"Two Sum",44.8,Difficulty.EASY);
	private final static Problem PROBLEM2 = new Problem(2,"Add Two Numbers",32.2,Difficulty.MEDIUM);
	private final static Problem PROBLEM3 = new Problem(3,"Longest Substring",29.1,Difficulty.MEDIUM);
	private final static Problem PROBLEM4 = new Problem(4,"Median of Two sorted Array",27.8,Difficulty.HARD);
	private final static Problem PROBLEM5 = new Problem(5,"Longest Palindrone Substring",28.3,Difficulty.MEDIUM);
	
	public static void main(String[] args) {
		Problems test = new Problems();
		test.add(PROBLEM2,PROBLEM1,PROBLEM3,PROBLEM5,PROBLEM4);
		
		System.out.println("This is the original order of the problems:");
		System.out.println(test);
		
		test.sortId();
		System.out.println("After sorted by ID number:");
		System.out.println(test);
		
		test.sortAcceptance();
		System.out.println("After sorted by acceptance(ascending):");
		System.out.println(test);
		
		test.sortDifficulty();
		System.out.println("After sorted by difficulty(easy to hard):");
		System.out.println(test);
		
	}

}
