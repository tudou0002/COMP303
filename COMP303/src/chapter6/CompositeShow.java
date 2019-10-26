package chapter6;

import java.util.ArrayList;
import java.util.List;

public class CompositeShow implements Show{
	
	private List<Show> shows = new ArrayList<>();
	
	public CompositeShow(Show ...shows) {
		
	}

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int RunningTime() {
		// TODO Auto-generated method stub
		return 0;
	}

}
