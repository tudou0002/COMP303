package iterator;

public class Item 
{
	
	private final String aName;
	private double aPrice;
	
	public Item(String pName, double pPrice)
	{
		aName = pName;
		aPrice = pPrice;
	}
	
	public String getName() 
	{
		return aName;
	}
	
	public double getPrice() 
	{
		return aPrice;
	}
	
	public String toStirng()
	{
		return aName + " $" + aPrice;
	}
	
}
