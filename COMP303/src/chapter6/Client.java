package chapter6;

public class Client {
	
	private static final Movie CARVE_UP = new Movie("What a Carve up", 1961, 87);
	private static final Movie GIANT_CLAW = new Movie("The Giant Claw", 1957, 75);
	private static final Movie ALLIGATOR = new Movie("The Alligator People", 1959, 74);
	
	public static void main(String[] args) {
//		Program program = new Program();
//		
////		new ClearCommand().execute(program);
		lec13();
	}
	
	public static void lec13() {
		ConferencedMovie cf = new ConferencedMovie("Pat Johnson", 10, CARVE_UP);
		MultiMovie mm = new MultiMovie(GIANT_CLAW, ALLIGATOR);
		Program program = new Program();
		program.add(cf, Day.MONDAY);
		program.add(mm, Day.FRIDAY);
		System.out.println(program);
	}

}
