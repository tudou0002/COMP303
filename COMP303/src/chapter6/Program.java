package chapter6;

import java.util.EnumMap;

public class Program {
	private final EnumMap<Day,Show> aShows = new EnumMap<>(Day.class);
	
	private static Show aDefault;
	
	public static void setDefault(Show pShow) {
		aDefault = pShow;
	}
//	private final CommandProcessor;
	
	public static Program createdWithDefault() {
		Program result = new Program();
		for(Day day : Day.values()) {
			result.aShows.put(day, aDefault);
		}
		return result;
	}
	
	public Program() {
		clear();
	}
	
	public void clear() {
		for(Day day : Day.values()) {
			aShows.put(day, new NullShow());
		}
	}
	
	public void add(Show pShow, Day pDay) {
		assert pShow!=null && pDay != null;
		aShows.put(pDay, pShow);
	}
	
	public Show get(Day pDay) {
		assert pDay != null;
		return aShows.get(pDay);
	}
	
	public void remove(Day pDay) {
		assert pDay!= null;
		aShows.remove(pDay);
	}
	
	@Override
	//from https://github.com/prmr/DesignBook/blob/master/solutions-code/chapter6/Program.java
	public String toString()
	{
		StringBuilder result = new StringBuilder();
		for( Day day : aShows.keySet() )
		{
//			if( aShows.containsKey(day))
//			{
				result.append(String.format("%9s", day.name()))
					.append(": ").append(aShows.get(day).description()).append("\n");
//			}
		}
		return result.toString();
	}
	
//	//factory method makes the code much more easier
//	public Command createRemoveCommand(Day pDay) {
//		return new Command() {
//		private Show aRemoved;
//
//	
//		@Override
//		public void execute() {
//			// TODO Auto-generated method stub
//			aRemoved = Optional.
//			aProgram.remove(pDay);
//		}
//		@Override
//		public void undo() {
//			// TODO Auto-generated method stub
//			
//		}}
//
//	}
//	
//	public Command createAddCommand(Day pDay) {
//		return new Command() {
//			//no need for constructor and no program field
//			
//		}
//	}
//	
//	public Command createClearCommand(Day pDay) {
//		return new Command() {
//			
//		}
//	}

}
