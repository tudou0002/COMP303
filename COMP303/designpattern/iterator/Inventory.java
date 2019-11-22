package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * Let Inventory implements Iterable so that we can access the aggregate object without knowing its
 * underlying structure.
 * Should be able to traverse the Inventory in both forward and backward manner.
 */

public class Inventory implements Iterable<Item>{
	
	private List<Item> aItems;
	private boolean traverseForward = true;
	
	public Inventory() 
	{
		aItems = new ArrayList<>();
	}
	
	public Inventory(ArrayList<Item> pItems) 
	{
		aItems = new ArrayList<>(pItems);
	}
	
	public void addItem(Item i) 
	{
		aItems.add(i);
	}
	
	public void setTraverse(boolean pTraverse)
	{
		traverseForward = pTraverse;	
	}
	
	

	/*
	 * I want to let the client to decide which direction they want to traverse at runtime
	 * not sure using a flag is a good idea... anyway I might change it after I find a better
	 * solution :)
	 */
	@Override
	public Iterator<Item> iterator() 
	{
		
		//use an anonymous class to create a one time use iterator sweet
		if (traverseForward == true) return new Iterator<Item> () {
			
			private int current = 0;

			@Override
			public boolean hasNext() {
				return !(current==aItems.size());
			}

			@Override
			public Item next() {
				return aItems.get(current++);
			}
			
		};
		
		//create a new class to implement iterator
		else return new BackwardIterator<>(aItems);
	}

}
