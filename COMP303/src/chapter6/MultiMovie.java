package chapter6;

import java.util.ArrayList;
import java.util.List;

public class MultiMovie implements Show{

	private List<Show> shows = new ArrayList<>();
	
	public MultiMovie(Show ...pshows) {
		for(Show show : pshows) {
			shows.add(show);
		}
	}
	@Override
	public String description() {
		StringBuilder str = new StringBuilder();
		for(Show show : shows) {
			str.append(show.description()+" ");
		}
		return str.toString();
	}

	@Override
	public int RunningTime() {
		int time = 0;
		for(Show show: shows) {
			time += show.RunningTime();
		}
		return time;
	}
	

}
