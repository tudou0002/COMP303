package review;

public interface Scheduler {

	Biker schedule(Location from, Location to, Iterable<Biker> bikers) throws SchedulingException;
}
