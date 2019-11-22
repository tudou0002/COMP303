package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BackwardIterator<Item> implements Iterator<Item>{

	private List<Item> aItems;
	private int current;
	
	public BackwardIterator(List<Item> list) {
		aItems = new ArrayList<>(list);
		current = aItems.size()-1;
	}
	
	@Override
	public boolean hasNext() {
		return !(current==-1);
	}

	@Override
	public Item next() {
		
		return aItems.get(current--);
	}

}
