package chapter6;

import java.util.ArrayList;
import java.util.List;

public class CommandProcessor {
	//demeter law
	
	private final List<Command> aCommands = new ArrayList<>();
	
	public void add(Command pCommand) {
		aCommands.add(pCommand);
	}
	
	public Command getLast() {
		return aCommands.get(aCommands.size()-1);
		
	}
	
	public void undoLast() {
		assert
		Command command = 
	}

}
