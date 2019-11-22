package template;

public class Latte extends MakeCoffee{

	@Override
	void addIngredient() {
		System.out.println("Heating milk...");
		System.out.println("Making milk foam...");
	}

	@Override
	void addSugar() {
		System.out.println("Adding the joy of the day...");
		
	}
	
	boolean someSugarPlease() {
		System.out.println("hmmm...I think you need some sweetness");
		return true;
	}
	
	
	
	

}
