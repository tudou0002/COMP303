package composite;

public class Regular implements Coffee{
	
	private double aPrice=1.49;
	
	

	@Override
	public double getPrice() {
		return aPrice;
	}

	@Override
	public String description() {
		return "Regular coffee";
	}

}
