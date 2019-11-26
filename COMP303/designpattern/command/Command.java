package command;

public interface Command {
	
	public int execute(int value);
	
	public int undo();

}
