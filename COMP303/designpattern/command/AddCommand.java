package command;

// a concrete command implements abstract command
public class AddCommand implements Command{
	
	private Adder adder= new Adder();
	private int aValue;

	@Override
	public int execute(int value) {
		aValue = value;
		return adder.add(aValue);
	}

	@Override
	public int undo() {
		return adder.add(-aValue);
	}

}
