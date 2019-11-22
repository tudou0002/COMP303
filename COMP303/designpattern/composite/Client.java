package composite;

public class Client {
	
	public static final Coffee REGULAR = new Regular();
	public static final Coffee ESPRESSO = new Espresso();
	
	public static void main(String[] args) {
		CoffeeShop SecondCup = new CoffeeShop("Second Cup");
		SecondCup.add(REGULAR,REGULAR,ESPRESSO);
		System.out.println(SecondCup);
	}

}
