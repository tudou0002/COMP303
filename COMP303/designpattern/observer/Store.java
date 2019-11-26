package observer;

import java.util.HashMap;
import java.util.Map;

import flyweight.Item;

public class Store implements Observer{
	
	// interested field from Subject
	private Map<Item,Integer> inventory ;
	private boolean isOpen;
	
	// store's name
	private final String aName;
	private Subject aCorporation;
	
	public Store(String pName, Subject pCorporation) {
		aName = pName;
		aCorporation = pCorporation;
		inventory = new HashMap<>();
		isOpen = true;
		pCorporation.register(this);
		System.out.println("New Store '"+aName+"' is created!");
	}
	
	public void print() {
		System.out.println("-----------------------------");
		if (isOpen) System.out.println(aName + " Provigo store is open now");
		else System.out.println("Provigo is closed now");
		System.out.println();
	}

	@Override
	public void itemAdded(Item item, int num) {
		int original = inventory.getOrDefault(item, 0);
		inventory.put(item, num+original);
		System.out.println(num +" "+ item.getName()+" is added from the store "+ aName);
	}

	@Override
	public void itemRemoved(Item item, int num) {
		int remain = inventory.get(item);
		if(remain>=num) {
			inventory.put(item,remain-num);
		}
		System.out.println(num +" "+ item.getName()+" is removed from the store "+ aName);
		
	}

	@Override
	public void opened(boolean pOpen) {
		this.isOpen = pOpen;
		
	}
	

}
