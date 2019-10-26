package chapter6;

public class ConferencedMovie implements Show{
	
	private String aName;
	private int aTime;
	private Show aShow;
	
	public ConferencedMovie(String pName, int pTime, Show pShow) {
		aName = pName;
		aTime = pTime;
		aShow = pShow;
	}
	
	@Override
	public String description() {
		return aName + " gives a " + aTime + " minutes talk. Then play " + aShow.description();
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
				&& ((ConferencedMovie)o).aShow.equals(aShow);
	}
	
	public int hashCode() {
		return aName.hashCode() + aTime + aShow.hashCode();
	}

}
