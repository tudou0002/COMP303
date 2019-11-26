package observer;

import java.util.HashMap;
import java.util.Map;

import flyweight.Item;

public class Website implements Observer{
	
	// interested field from Subject
	private Map<Item,Integer> inventory ;
	private boolean isOpen;
	
	private Subject aCorporation;
	
	public Website(Subject pCorporation) {
		aCorporation = pCorporation;
		inventory = new HashMap<>();
		isOpen = true;
		pCorporation.register(this);
		System.out.println("New Website is created!");
	}
	
	public String toString() {
		return "Welcome to "+ aCorporation.toString() +"'s website!";
	}

//	@Override
//	public void update(boolean pisOpen, Map<Item, Integer> pInventory) {
//		isOpen = pisOpen;
//		inventory = pInventory;
//		print();
//		
//	}
	
	public void print() {
		System.out.println("-----------------------------");
		if (isOpen) System.out.println("Provigo is open now");
		else System.out.println("Provigo is closed now");
		System.out.println();
	}

	@Override
	public void itemAdded(Item item, int num) {
		int original = inventory.getOrDefault(item, 0);
		inventory.put(item, num+original);
		System.out.println(num +" "+ item.getName()+" is added from the website");
		
	}

	@Override
	public void itemRemoved(Item item, int num) {
		int remain = inventory.get(item);
		if(remain>=num) {
			inventory.put(item,remain-num);
		}
		System.out.println(num +" "+ item.getName()+" is removed from the  website");
		
	}

	@Override
	public void opened(boolean pOpen) {
		this.isOpen = pOpen;
		
	}

}
