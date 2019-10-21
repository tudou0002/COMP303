package lec09;

import java.util.Iterator;

import lec07.Card;

public class NullIterable implements NullableIterable{

	@Override
	public Iterator<Card> iterator() {
		
		return new Iterator<Card>() {
			public boolean hasNext() {
				return false;
			}
			
			public Card next() {
				assert false;
				return null;
			}
		};
	}
	
	public boolean isNull() {
		return true;
	}

}
