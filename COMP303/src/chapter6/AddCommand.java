package chapter6;

public class AddCommand implements Command{
	
	private final Program aProgram;
	private final Day aDay;
	private final Show aShow;

	@Override
	public void execute() {
		
		
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}
	
	//3 fields
	
	public AddCommand(Program p, Day pDay, Show pShow) {
		
	}

}
