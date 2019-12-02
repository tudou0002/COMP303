package review;

public class GreedyScheduler extends AbstractScheduler{

	// we are sure bikers has next
	@Override
	protected Biker perform(Location from, Location to, Iterable<Biker> bikers) throws SchedulingException {
		return bikers.iterator().next();
	}

}
