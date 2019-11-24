package visitor;

public class Parttime implements Employee{
	
	private String aName;
	private int aWorkTime;
	private int aSalary;
	
	public Parttime(String pName, int time) {
		aName = pName;
		aWorkTime = time;
	}
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	
	public String getName() {
		return aName;
	}
	
	public int getTime()
	{
		return aWorkTime;
	}
	
//	public String toString() {
//		return aName + " worked " +aWorkTime+ " this week. Salary : " + aSalary;
//	}

}
