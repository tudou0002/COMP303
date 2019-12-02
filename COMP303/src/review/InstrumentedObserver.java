package review;

// decorator design pattern
public class InstrumentedObserver implements Scheduler
{
	private Scheduler aScheduler;

	@Override
	public Biker schedule(Location from, Location to, Iterable<Biker> bikers) throws SchedulingException {
		// TODO Auto-generated method stub
		return aScheduler.schedule(from, to, bikers);
	}
	

}
