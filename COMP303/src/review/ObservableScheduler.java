package review;

// observer design pattern
public interface ObservableScheduler extends Scheduler{
	void addObserver(SchedulerObserver o);

}
