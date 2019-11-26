package composite;

import java.util.ArrayList;

public class Directory implements File {
	
	private String aName;
	private ArrayList<File> aFiles = new ArrayList<>();
	
	public Directory(String pName, File ...files) {
		aName = pName;
		for (File f : files) {
			aFiles.add(f);
		}
	}
	

	@Override
	public void copy() {
		System.out.println(aName + " has been copied! ");

	}

	@Override
	public void description() {
		System.out.println(aName + " is a Directory containing: ");
		for(File f : aFiles ) {
			f.description();
		}
	}

	@Override
	public void rename(String s) {
		aName = s;
		
	}

}
