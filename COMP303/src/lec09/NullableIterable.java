package lec09;

import java.util.Iterator;

import lec07.Card;
//use extend when we want to add methods in an interface
public interface NullableIterable extends Iterable<Card>{
	 static NullableIterable NULL = new NullableIterable() {

		@Override
		public Iterator<Card> iterator() {
			return new Iterator<Card>() {

				@Override
				public boolean hasNext() {
					return false;
				}

				@Override
				public Card next() {
					assert false;
					return null;
				}
				
			};
			
		}
		
		@Override
		public boolean isNull() {
			return true;
		}
		 
	 };
	
	default boolean isNull() {
		return false;
	};

}
