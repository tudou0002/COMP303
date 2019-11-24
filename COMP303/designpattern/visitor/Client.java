package visitor;

public class Client {
	
	public static void main(String[] args) {
		TimeVisitor time = new TimeVisitor();
		SalaryVisitor salary = new SalaryVisitor();
		
		Fulltime bob = new Fulltime("Bob", 38);
		Parttime lisa = new Parttime("Lisa", 15);
		
		bob.accept(time);
		bob.accept(salary);
		
		lisa.accept(time);
		lisa.accept(salary);
	}

}
