package command;

public class Client {
	
	public static void main(String[] args) {
		Command c = new AddCommand();
		Calculator cal = new Calculator();
		cal.setCommand(c);
		
		cal.compute(3);
		cal.compute(5);
		cal.undo();
	}

}
