package chapter6;

public class NullShow implements Show{

	@Override
	public String description() {
		return "No show";
	}

	@Override
	public int RunningTime() {
		return 0;
	}
	
	public boolean isNull() {
		return true;
	}
	
	public boolean equals(Object o) {
		if (o==null) return false;
		return o.getClass() == getClass();
	}


}
