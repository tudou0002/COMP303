package composite;

public class TextFile implements File {
	
	private String aName;
	
	public TextFile(String pName) {
		aName = pName;
	}

	@Override
	public void copy() {
		System.out.println(aName + " has been copied! ");

	}
	
	@Override
	public void description() {
		System.out.println(aName + " is a TextFile ");
		
	}

	@Override
	public void rename(String s) {
		aName = s;
		
	}
}
