package review;

import java.util.ArrayList;
import java.util.List;

// template design pattern
public abstract class AbstractScheduler implements Scheduler {
	
	private List<SchedulerObserver> aObservers = new ArrayList<>();

	// methods implementing interface method has to be public
	@Override
	public final Biker schedule(Location from, Location to, Iterable<Biker> bikers) throws SchedulingException {
		
		check(bikers); // 1st step (a)
		Biker chosen = perform(from, to, bikers); // step (b)
		notifySome(chosen, from, to);
		return chosen;
	}
	
	public void addObserver(SchedulerObserver o) {
		aObservers.add(o);
	}
	
	public void notifySome(Biker b, Location from, Location to) 
	{
		for (SchedulerObserver o: aObservers) {
			o.bikerScheduled(b, from, to);
		}
	}
	
	protected abstract Biker perform(Location from, Location to, Iterable<Biker> bikers) throws SchedulingException;
	
	// check if the biker exists
	private static void check(Iterable<Biker> bikers) throws SchedulingException
	{
		if(!bikers.iterator().hasNext()) {throw new SchedulingException();}
	}

}
