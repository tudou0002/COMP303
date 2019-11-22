package composite;

import java.util.ArrayList;
import java.util.List;

/*
 * Coffee shop can have many different coffee.
 */
public class CoffeeShop {
	
	private final String aName;
	private List<Coffee> all;
	
	public CoffeeShop(String pName) {
		aName = pName;
		all = new ArrayList<>();
	}
	
	public void add(Coffee ...coffee) {
		for(Coffee c : coffee) {
			all.add(c);
		}
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Coffee in "+ aName + " made with love: \n");
		for(Coffee c : all) {
			sb.append(c.description());
			sb.append("\n");
		}
		return sb.toString();
	}

}
