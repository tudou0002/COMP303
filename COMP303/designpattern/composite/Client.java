package composite;

public class Client {
	
	public static final File T1 = new TextFile("t1.txt");
	public static final File T2 = new TextFile("t2.txt");
	public static final File I1 = new ImageFile("j1.jpg");
	
	
	public static void main(String[] args) {
		File d1 = new Directory("text", T1,T2);
		File d2 = new Directory("all", d1,I1);
		
		d2.description();
		
	}

}
