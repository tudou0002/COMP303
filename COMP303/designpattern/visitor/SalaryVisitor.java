package visitor;

public class SalaryVisitor implements Visitor{
	
	@Override
	public void visit(Parttime part) {
		System.out.println(part.getName()+"'s salary is $" + 15*part.getTime());
	}

	@Override
	public void visit(Fulltime full) {
		System.out.println(full.getName()+"'s salary is $" + 20*full.getTime());
	}

}
