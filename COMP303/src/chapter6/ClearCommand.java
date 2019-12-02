package chapter6;

import java.util.EnumMap;
import java.util.Optional;

public class ClearCommand implements Command{

	private Optional<EnumMap<Day, Show>> aOld;
	private final Program aProgram;
	//private Optional<Program> aOld = Optional.empty(); if we have a copy() method in program class
	
	public ClearCommand(Program program) {
		aProgram = program;
	}
	
	@Override
	public void execute() {
		EnumMap<Day, Show> temp = new EnumMap(Day.class);
		for(Day day: Day.values()) {
			temp.put(day, aProgram.get(day));
		}
		aOld = Optional.of(temp);
		aProgram.clear();
	}

	@Override
	public void undo() {
		assert aOld.isPresent();
		for(Day day : Day.values()) {
			aProgram.add(aOld.get(). get(day),day);
		}
	}
	
	

}
