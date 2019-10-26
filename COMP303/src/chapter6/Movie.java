package chapter6;

public class Movie implements Show{
	
	private String aTitle;
	private int aYear;
	private int aTime;
	
	public Movie(String pTitle,int pYear, int pTime) {
		aTitle = pTitle;
		aYear = pYear;
		aTime = pTime;
	}

	@Override
	public String description() {
		return aTitle +", made on"+ aYear;
	}

	@Override
	public int RunningTime() {
		return aTime;
	}
	
	public boolean equals(Object o) {
		if(this == o) return true;
		else if(o == null) return false;
		else if (o.getClass() != getClass()) return false;
		else {
			//downcasting: from a super class Object to a subclass Movie
			return ((Movie)o).aTitle == aTitle && ((Movie)o).aYear == aYear 
					&& ((Movie)o).aTime == aTime ;
			
		}
	}
	
	public int hashCode() {
		return aTitle.hashCode() + aYear + aTime;
	}

}
