package chapter6;

public class ConferencedShow implements Show{
	
	private String aName;
	private int aTime;
	private Show aShow;
	
	public ConferencedShow(String pName, int pTime, Show pShow) {
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
		else return ((ConferencedShow)o).aName ==aName && ((ConferencedShow)o).aTime ==aTime
				&& ((ConferencedShow)o).aShow.equals(aShow);
	}
	
	public int hashCode() {
		return aName.hashCode() + aTime + aShow.hashCode();
	}

}
