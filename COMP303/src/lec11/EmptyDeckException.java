package lec11;

public class EmptyDeckException extends RuntimeException{
	
	public EmptyDeckException() {}
	
	public EmptyDeckException(String arg0) {
		super(arg0);
	}
	
	public EmptyDeckException(Throwable arg0) {
		super(arg0);
	}
	

}
