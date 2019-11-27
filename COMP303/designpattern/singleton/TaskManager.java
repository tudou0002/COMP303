package singleton;

// one could also use enum type with only one constant to realize singleton design pattern

public class TaskManager {
	
	// a global variable for holding an reference to the single instance of the singleton object
	private static final TaskManager INSTANCE = new TaskManager();
	
	// a private constructor, so the client cannot create duplicate
	private TaskManager() {
		
	}
	
	// an accessor method returns the singleton instance
	public static TaskManager instance() {
		return INSTANCE;
	}

	// other methods...
	public void displayProcess() {
		System.out.println("Current processes are ...");
	}
}
