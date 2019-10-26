package chapter6;

import java.util.Optional;

public class ClearCommand implements Command{

	private final Program aProgram;
	//private Optional<Program> aOld = Optional.empty(); if we have a copy() method in program class
	
	@Override
	public void execute() {
		aOld = Optinal.of(aProgram)
		aProgram.clear();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}
	
	

}
