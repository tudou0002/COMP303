package chapter6;

public class DoubleBill implements Show{
	
	private Movie m1;
	private Movie m2;
	
	public DoubleBill(Movie p1, Movie p2) {
		m1 = p1;
		m2 = p2;
	}



	@Override
	public String description() {
		return m1.description()+ m2.description();
	}

	@Override
	public int RunningTime() {
		// TODO Auto-generated method stub
		return m1.RunningTime()+m2.RunningTime();
	}
	
}
