package template;

public class Client {
	
	public static void main(String[] args) {
		
		/*
		 *  I overwritten the hook method in the superclass
		 *  Now you can enjoy a sweet latte :)
		 */
		Latte latte = new Latte();
		latte.make();
	}

}
