package prototype;

public class Client {
	
	private Post aPrototype = new Blog(); //default
	
	public void setPrototype(Post pPrototype) {
		aPrototype = pPrototype;
	}
	
	public Post createAPost() {
		return aPrototype;
	}
	
	public String toString() {
		return aPrototype.toString();
	}
	
	public static void main(String[] args) {
		// show the default prototype
		Client c = new Client();
		System.out.println(c);
		
		//change the default prototype to Note
		Note note = new Note("McGill","Comp303");
		c.setPrototype(note);
		System.out.println(c);
	}

}
