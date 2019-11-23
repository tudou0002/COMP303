package prototype;

import java.time.LocalDate;

public class Blog implements Post{
	
	private LocalDate date = LocalDate.now();
	
	public Blog() {
		System.out.println("-------------------------");
		System.out.println(date);
		System.out.println("A new blog is made.");
	}

	@Override
	public Post makeCopy() {
		
		try {
			Blog clone = (Blog) super.clone();
			return clone;
			
		} catch (CloneNotSupportedException e) {
			System.out.println("Note cannot be cloned right now...");
			return null;
			
		}
	}
	
	public String toString() {
		return "Now you can start with your new blog...";
	}

}
