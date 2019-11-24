package visitor;

public interface Visitor {
	
	// arguments are concrete visitable objects
	public void visit(Parttime part);
	public void visit(Fulltime full);

}
