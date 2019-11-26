package command;

public class Calculator {
	
	private Command command;
	
	public void setCommand(Command c) {
		command = c;
	
	}
	
	public void compute(int value) {
		int result = command.execute(value);
		System.out.println("Command Executed with a result of " + result);
	}
	
	public void undo() {
		int result = command.undo();
		System.out.println("Command Undoed with a result of " + result);
	}

}
