package visitor;

public class TimeVisitor implements Visitor{

	@Override
	public void visit(Parttime part) {
		System.out.println(part.getName()+" worked " + part.getTime() + " hrs");
	}

	@Override
	public void visit(Fulltime full) {
		System.out.println("Fulltime Employee should work 40 hrs per week ");
		if(full.getTime()<40) {
			System.out.println(full.getName()+" left for " + (40-full.getTime()) + " hrs");
			
		}
	}

}
