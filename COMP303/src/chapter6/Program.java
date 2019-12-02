package chapter6;

import java.util.EnumMap;
import java.util.Optional;

public class Program {
	private final EnumMap<Day,Show> aShows = new EnumMap<>(Day.class);
	private final CommandProcessor aProcessor = new BasicCommandProcessor();
	
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
	
	public Program(CommandProcessor pProcessor) {
		aProcessor = pProcessor;
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
	
	//factory method makes the code much more easier
	public Command createRemoveCommand(Day pDay) {
		return new Command() {
		private Optional<Show> aRemoved = Optional.empty();

	
		@Override
		public void execute() {
			// TODO Auto-generated method stub
			Show show = get(pDay);
			aRemoved = Optional.of(show);
			remove(pDay);
		}
		@Override
		public void undo() {
			assert aRemoved.isPresent();
			add(aRemoved.get(),pDay);
		}};

	}
	
	public Command createAddCommand(Day pDay,Show pShow) {
		return new Command() {

			@Override
			public void execute() {
				add(pShow,pDay);
			}

			@Override
			public void undo() {
				remove(pDay);
			}
			
		};
	}
	
	public Command createClearCommand(Day pDay) {
		return new Command() {
			private Optional<EnumMap<Day,Show>> aOld = Optional.empty();
			
		

			@Override
			public void execute() {
				aOld = Optional.of((EnumMap<Day,Show>) new EnumMap(aShows));
				clear();
				
			}

			@Override
			public void undo() {
				assert aOld.isPresent();
				for (Day day : Day.values()) {
					add(aOld.get().get(day),day);
				}
			}};
	}

}
