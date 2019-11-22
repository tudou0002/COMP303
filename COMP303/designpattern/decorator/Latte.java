package decorator;

import composite.Coffee;

public class Latte implements Coffee{
	
	private Coffee aBasic;
	private double aPrice;

	public Latte(Coffee pBasic) {
		aBasic = pBasic;
		aPrice = pBasic.getPrice();
	}
	
	@Override
	public double getPrice() {
		return (aPrice + 1.0);
	}

	@Override
	public String description() {
		return "Latte made with milk and " + aBasic.description() ;
	}

}
