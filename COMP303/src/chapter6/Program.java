package chapter6;

import java.util.EnumMap;

public class Program {
	private final EnumMap<Day,Show> aShows = new EnumMap<>(Day.class);
	private final CommandProcessor
	
	public Program() {
		clear();
	}
	
	public void clear() {
		aShows.clear();
	}
	
	//factory method makes the code much more easier
	public Command createRemoveCommand(Day pDay) {
		return new Command() {
		private Show aRemoved;

	
		@Override
		public void execute() {
			// TODO Auto-generated method stub
			aRemoved = Optional.
			aProgram.remove(pDay);
		}
		@Override
		public void undo() {
			// TODO Auto-generated method stub
			
		}}

	}
	
	public Command createAddCommand(Day pDay) {
		return new Command() {
			//no need for constructor and no program field
			
		}
	}
	
	public Command createClearCommand(Day pDay) {
		return new Command() {
			
		}
	}

}
