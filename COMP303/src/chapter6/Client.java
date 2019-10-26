package chapter6;

public class Client {
	
	private static final Movie CARVE_UP = new Movie("What a Carve up", 1961, 87);
	private static final Movie GIANT_CLAW = new Movie("The Giant Claw", 1957, 75);
	private static final Movie ALLIGATOR = new Movie("The Alligator People", 1959, 74);
	
	public static void main(String[] args) {
//		Program program = new Program();
//		
////		new ClearCommand().execute(program);
//		lec12();
		lec13();
	}
	
	public static void lec12() {
		ConferencedMovie cf = new ConferencedMovie("Pat Johnson", 10, CARVE_UP);
		MultiMovie mm = new MultiMovie(GIANT_CLAW, ALLIGATOR);
		Program program = new Program();
		program.add(cf, Day.MONDAY);
		program.add(mm, Day.FRIDAY);
		System.out.println(program);
	}
	
	public static void lec13() {
		ConferencedMovie cf = new ConferencedMovie("Pat Johnson", 10, CARVE_UP);
		CompositeShow movies = new CompositeShow(GIANT_CLAW, ALLIGATOR);
		CompositeShow complete = new CompositeShow(cf, movies);
		ConferencedShow all = new ConferencedShow("Canada's upcoming PM", 15, complete);
		
		Program program = new Program();
		program.add(new CompositeShow(all,movies), Day.MONDAY);
		
		Program.setDefault(CARVE_UP);
		Program p1 = Program.createdWithDefault();
		System.out.println(p1);
		Program.setDefault(ALLIGATOR);
		Program p2 = Program.createdWithDefault();
		p2.clear();
		System.out.println(p2);
		
	}

}
