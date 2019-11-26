package template;

// abstract class for making coffee
// template design pattern is more likely used in describing a process
public abstract class MakeCoffee {
	
	
	
	// subclass cannot change 'final' method
	final void make() {
		brew();
		addIngredient();
		if(someSugarPlease()) addSugar();
		pourIntoCup();
	}
	
	//subclass must overwrite 'abstract' method
	abstract void addIngredient();
	abstract void addSugar();
	
	//subclass can either overwrite this method or not (hook method)
	boolean someSugarPlease() {
		return false;
	}
	
	public void pourIntoCup() {
		System.out.println("Your coffee is ready now!");
	}
	
	public void brew() {
		System.out.println("Brewing coffee...");
	}

}
