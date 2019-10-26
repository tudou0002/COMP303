package chapter6;

import java.util.ArrayList;
import java.util.List;

public class CompositeShow implements Show{
	
	private List<Show> aShows = new ArrayList<>();
	
	public CompositeShow(Show ...shows) {
		for(Show show: shows) {
			aShows.add(show);
		}
	}

	@Override
	public String description() {
		StringBuilder str = new StringBuilder();
		for(Show show : aShows) {
			str.append(show.description()+" ");
		}
		return str.toString();
	}

	@Override
	public int RunningTime() {
		int time = 0;
		for(Show show: aShows) {
			time += show.RunningTime();
		}
		return time;
	}

}
