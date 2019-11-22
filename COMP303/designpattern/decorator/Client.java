package decorator;

import composite.Coffee;
import composite.CoffeeShop;
import composite.Espresso;
import composite.Regular;

public class Client {
	
	public static final Coffee REGULAR = new Regular();
	public static final Coffee ESPRESSO = new Espresso();
	private static final Latte LATTE = new Latte(ESPRESSO);

	public static void main(String[] args) {
		CoffeeShop castel = new CoffeeShop("Castel");
		castel.add(REGULAR,ESPRESSO, LATTE);
		
		System.out.println(castel);
	}
}
