package composite;

public interface File {
	
	void copy(); // need iteration in Composite, for simplicity, I'll just print out a sentence.
	void description();
	void rename(String s); // no need to iterate in Composite

}
