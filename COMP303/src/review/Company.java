package review;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Company implements Iterable<Biker>, SchedulerObserver{
	
	private List<Biker> aBikers;
	private Scheduler aScheduler = (a,b,c) -> { throw new SchedulingException();};
			
	public Company(AbstractScheduler pScheduler, Biker ...bikers) 
	{
		//((AbstractScheduler)pScheduler).addObserver(this); //bad implementation, could throw an exception
		pScheduler.addObserver(this);
		aBikers = Arrays.asList(bikers);
		aScheduler = pScheduler;
	}

	@Override
	public Iterator<Biker> iterator() 
	{
		// TODO Auto-generated method stub
		return aBikers.iterator();
	}

	@Override
	public void bikerScheduled(Biker b, Location from, Location to) 
	{
		System.out.println("Scheduled " + b);
	}

}
