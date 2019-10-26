package chapter6;

public class RemoveCommand implements Command{

	private final Program aProgram;
	private Show aRemoved;
	private final Day aDay;
	//constructor
	public RemoveCommand(Program pProgram, Day pDay) {
		aProgram = pProgram;
		aDay = pDay;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		aRemoved = Optional.
		aProgram.remove(aDay);
	}
	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}

}
