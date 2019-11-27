package decorator;

import composite.File;
import composite.ImageFile;
import composite.TextFile;

public class Client {
	
	public static final File T1 = new TextFile("t1.txt");
	public static final File T2 = new TextFile("t2.txt");
	public static final File I1 = new ImageFile("j1.jpg");


	public static void main(String[] args) {
		File redfile = new RedTagFile(T1);
		redfile.description();
	}
}
