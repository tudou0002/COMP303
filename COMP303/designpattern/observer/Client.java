package observer;

import flyweight.Item;

public class Client {
	
	public final static Item i1 = Item.createItem("apple", 4053, 289);
	public final static Item i2 = Item.createItem("Apple", 4053, 99);
	public final static Item i3 = Item.createItem("kiwi", 4062, 329);
	public final static Item i4 = Item.createItem("apple", 4053, 289);
	
	public static void main(String[] args) {
		Corporation provigo = new Corporation("Provigo");
		
		// creates observers that will be sent info from subject(provigo)
		Store westmount = new Store("westmount",provigo);
		Store downtown = new Store("downtown",provigo);
		Website website = new Website(provigo);
		
		provigo.addItems(i1, 10);
		provigo.addItems(i2, 20);
		provigo.addItems(i1, 7);
		provigo.addItems(i3, 16);
		provigo.removeItems(i2, 5);
		
		//provigo.open(false);
		provigo.open(true);
		
		System.out.println(provigo.toString());
	}

}
