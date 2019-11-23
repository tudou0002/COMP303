package prototype;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Note implements Post{
	
	private LocalDate date = LocalDate.now();
	private List<String> aTags = new ArrayList<>();
	
	public Note(String ...tag) {
		System.out.println("-------------------------");
		System.out.println(date);
		System.out.println("A new post is made.");
		for(String s: tag) {
			aTags.add(s);
		}
		System.out.println("Tags are : "+ aTags);
	}

	@Override
	public Post makeCopy() {
		
		Note clone = null;
		try {
			clone = (Note) super.clone();
			clone.aTags = new ArrayList<>();
			// if the objects in ArrayList is self-defined, make sure it has clone() in order to 
			//make a deep copy
			//wait... since String is immutable, should we still use clone()?
			for(String s : aTags) {
				clone.aTags.add(s);
			}
			
		} catch (CloneNotSupportedException e) {
			System.out.println("Note cannot be cloned right now...");
			e.printStackTrace();
		}
		return clone;
	}
	
	public String toString() {
		return "Now you can start with your new note...";
	}

}
