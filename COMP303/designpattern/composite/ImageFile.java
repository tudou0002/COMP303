package composite;

public class ImageFile implements File {
	
	private String aName;
	
	public ImageFile(String pName) {
		aName = pName;
	}

	@Override
	public void copy() {
		System.out.println(aName + " has been copied! ");

	}

	@Override
	public void description() {
		System.out.println(aName + " is an ImageFile ");
		
	}

	@Override
	public void rename(String s) {
		aName = s;
		
	}

}
