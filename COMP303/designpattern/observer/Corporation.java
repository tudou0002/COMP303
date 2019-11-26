package observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import flyweight.Item; // an Item object implements flyweight pattern

// the concrete subject
public class Corporation implements Subject{
	
	// an ArrayList hold all stores(observers)
	private ArrayList<Observer> aObservers;
	
	private final String aName;
	private Map<Item,Integer> inventory ;
	private boolean isOpen;
	
	public Corporation(String pName) {
		aName = pName;
		aObservers = new ArrayList<>();
		inventory = new HashMap<>();
		isOpen = true;
	}
	
	/*
	 * I directly invoked the callback method in the state changing methods
	 */
	public void addItems(Item item, int num) {
		int original = inventory.getOrDefault(item, 0);
		inventory.put(item, num+original);
		for (Observer o : aObservers) {
			o.itemAdded(item, num);
		}
	}
	
	public void removeItems(Item item, int num) {
		assert inventory.get(item) != null;
		int remain = inventory.get(item);
		if(remain>=num) {
			inventory.put(item,remain-num);
			for (Observer o : aObservers) {
				o.itemRemoved(item, num);
			}
		}
	}
	
	public void open(boolean o) {
		isOpen = o;
		for (Observer observer : aObservers) {
			observer.opened(o);
		}
	}
	
	public String toString() {
		return aName + inventory.toString();
	}
	
	@Override
	public void register(Observer s) {
		aObservers.add(s);
		
	}

	@Override
	public void unregister(Observer s) {
		aObservers.remove(s);
		
	}

	/*
	 * When the notifyOnserver method MUST be inserted to every state changing method, it can be private
	 * @see observer.Subject#notifyObserver()
	 */
//	@Override
//	private void notifyObserver() {
//		// I used push pattenr here
//		for (Observer o : aObservers) {
//			o.update(isOpen, inventory);
//		}
//		
//	}

}
