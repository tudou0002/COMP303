package flyweight;

public class Client {
	
	public final static Item i1 = Item.createItem("apple", 4053, 289);
	public final static Item i2 = Item.createItem("Apple", 4053, 99);
	public final static Item i3 = Item.createItem("kiwi", 4062, 329);
	public final static Item i4 = Item.createItem("apple", 4053, 289);
	
	public static void main(String[] args) {
		
		//because the Item object is immutable, so i2 will not change i1's record
		//maybe this is not a very suitable example...
		System.out.println(i1==i2);
		System.out.println(i1);
		System.out.println(i2);
		
		System.out.println(i1==i4);
	}

}
