package flyweight;

import java.util.HashMap;
import java.util.Map;

/*
 * Flyweight: when you want to manage the creation of objects of a class. Provides a way to manage 
 * collections of immutable objects, also ensures the uniqueness of objects.
 * 
 * In this example, I want to make each Item in a grocery store to be unique by using flyweight.
 * Later I probably want to store Item and their number into inventory.
 * 
 * Basic structures imported from https://github.com/prmr/COMP303Starter/tree/master/sample1/labtest01
 * 
 * An easier version is to create a separate factory class to control the initialization of the objects.
 * But I use abstract factory method and lazy-initialization here.
 */

public class Item {
	
	private final String aName;
	private final int aId;
	private final int aPrice; // in cent
	
	/* create two static flyweight store to keeps all instances. One with key as ID, the other with
	 * keys as Name of the Item. Therefore, client can create an object in two ways??
	 */

	private static Map<Integer, Item> byId = new HashMap<>();
	private static Map<String, Item> byName = new HashMap<>();
	
	
	/**
	 * A private constructor which creates a new item.
	 * @param pName A unique name of the item.
	 * @param pId A unique id for the item
	 * @param pPrice The price of the item in cents
	 */
	private Item(String pName, int pId, int pPrice)
	{
		aName = pName;
		aId = pId;
		aPrice = pPrice;
	}
	
	/* static access method(factory method), assume once one create an Item, it cannot be changed
	 * Since flyweight objects should be immutable to ensure that their uniqueness can be preserved
	 */
	
	public static Item createItem(String pname,int pId,int pPrice) {
		
		String pName = pname.toLowerCase();
		
		// if the item doesn't exist, create a new one
		if (byId.get(pId) == null && byName.get(pName) == null) {
			Item item = new Item(pName, pId, pPrice);
			byId.put(pId, item);
			byName.put(pName, item);
			
		}
		return byName.get(pName);
	}
	
	public boolean equals(Item i) {
		
		if (i==null) return false;
		else if (i==this) return true;
		else if (i.getClass() != getClass()) return false;
		else {
			return i.getName().equals(this.getName());
		}
	}
	

	/**
	 * @return The name of the item
	 */
	public String getName()
	{
		return aName;
	}
	
	/**
	 * @return The ID of the item.
	 */
	public int getId()
	{
		return aId;
	}
	
	/**
	 * @return The price of the item in cents
	 */
	public int getPrice()
	{
		return aPrice;
	}
	
	public String toString() {
		return String.format("#%d %s $%f", aId, aName, (aPrice/100.0));
	
	}
	

}
