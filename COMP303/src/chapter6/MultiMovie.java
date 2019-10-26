package chapter6;

import java.util.ArrayList;
import java.util.List;

public class MultiMovie implements Show{

	private List<Show> aMovies = new ArrayList<>();
	
	public MultiMovie(Movie ...pmovies) {
		for(Show show : pmovies) {
			aMovies.add(show);
		}
	}
	@Override
	public String description() {
		StringBuilder str = new StringBuilder();
		for(Show show : aMovies) {
			str.append(show.description()+" ");
		}
		return str.toString();
	}

	@Override
	public int RunningTime() {
		int time = 0;
		for(Show show: aMovies) {
			time += show.RunningTime();
		}
		return time;
	}
	

}
