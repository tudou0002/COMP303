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
	
	public void addItems(Item item, int num) {
		inventory.putIfAbsent(item, num);
		notifyObserver();
	}
	
	public void open(boolean o) {
		isOpen = o;
		notifyObserver();
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

	@Override
	public void notifyObserver() {
		// I used push pattenr here
		for (Observer o : aObservers) {
			o.update(isOpen, inventory);
		}
		
	}

}
