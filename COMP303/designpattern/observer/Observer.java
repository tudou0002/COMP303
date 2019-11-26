package observer;

import java.util.Map;

import flyweight.Item;

// the observer interface
public interface Observer {
	
//	public void update(boolean isOpen, Map<Item, Integer> inventory);
	
	public void itemAdded(Item item, int num);
	public void itemRemoved(Item item, int num);
	public void opened(boolean isOpen);

}
