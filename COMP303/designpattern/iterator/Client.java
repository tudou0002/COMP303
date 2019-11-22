package iterator;

public class Client {
	private final static Item ITEM1 = new Item("tissue paper", 3.89);
	private final static Item ITEM2 = new Item("milk", 4.59);
	private final static Item ITEM3 = new Item("apple", 2.99);
	private final static Item ITEM4 = new Item("ice cream", 5.29);
	
	
	public static void main(String[] args)
	{
		Inventory basic = new Inventory();
		basic.addItem(ITEM1);
		basic.addItem(ITEM2);
		basic.addItem(ITEM3);
		basic.addItem(ITEM4);
		basic.setTraverse(false);
		
		for (Item i : basic) {
			System.out.println(i.toStirng());
		}
	}

}
