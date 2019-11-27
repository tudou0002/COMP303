package decorator;

import composite.File;

// a decorator which can tag a file with red tag, still behaves like a File cuz it implements File
public class RedTagFile implements File {
	private File file;
	
	public RedTagFile(File f) {
		file = f;
	}

	@Override
	public void copy() {
		file.copy();

	}

	@Override
	public void description() {
		file.description() ;
		System.out.println("tagged as red ") ;

	}

	@Override
	public void rename(String s) {
		file.rename(s);

	}

}
