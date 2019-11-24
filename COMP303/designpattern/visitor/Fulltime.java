package visitor;

public class Fulltime implements Employee{

	private String aName;
	private int aWorkTime;
	private int aSalary;
	
	public Fulltime(String pName,int time) {
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
//		return aName + " worked " +(40-aLeaveTime)+ " this week. Salary : " + aSalary;
//	}
	
	
	
}
