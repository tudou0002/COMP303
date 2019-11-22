package composite;

public class Espresso implements Coffee{
	
	double aPrice=2.49;

	@Override
	public double getPrice() {
		return aPrice;
	}

	@Override
	public String description() {
		return "Espresso" ;
	}
	

}
