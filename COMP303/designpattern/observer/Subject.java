package observer;

public interface Subject {
	
	// add an observer to the subject
	public void register(Observer s);
	
	// remove the observer from the subject
	public void unregister(Observer s);


}
