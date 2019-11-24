package observer;

import java.util.Map;

import flyweight.Item;

// the observer interface
public interface Observer {
	
	public void update(boolean isOpen, Map<Item, Integer> inventory);

}
