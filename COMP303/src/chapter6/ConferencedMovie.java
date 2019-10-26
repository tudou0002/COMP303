package chapter6;

public class ConferencedMovie implements Show{
	
	private String aName;
	private int aTime;
	private Movie aMovie;
	
	public ConferencedMovie(String pName, int pTime, Movie pMovie) {
		aName = pName;
		aTime = pTime;
		aMovie = pMovie;
	}
	
	@Override
	public String description() {
		return aName + " gives a " + aTime + " minutes talk. Then play " + aMovie.description();
	}
	@Override
	public int RunningTime() {
		return aTime;
	}
	
	public boolean equals(Object o) {
		if(o==null) return false;
		else if (this == o) return true;
		else if(o.getClass() != getClass()) return false;
		else return ((ConferencedMovie)o).aName ==aName && ((ConferencedMovie)o).aTime ==aTime
				&& ((ConferencedMovie)o).aMovie.equals(aMovie);
	}
	
	public int hashCode() {
		return aName.hashCode() + aTime + aMovie.hashCode();
	}

}
