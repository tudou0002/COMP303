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

	@Override
	public void update(boolean pisOpen, Map<Item, Integer> pInventory) {
		this.isOpen = pisOpen;
		// in this case the field is a hashmap, can I copy directly?
		inventory = pInventory;
		print();
	}
	
	public void print() {
		System.out.println("-----------------------------");
		if (isOpen) System.out.println(aName + " Provigo store is open now");
		else System.out.println("Provigo is closed now");
		System.out.println();
	}
	

}
