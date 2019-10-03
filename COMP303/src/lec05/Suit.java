package lec05;

public enum Suit 
{
	CLUBS("\u2663"), DIAMONDS("\u2662"), SPADES("\u2660"), HEARTS("\u2661");
	
	private final String aSymbol;
	
	private Suit(String pSymbol) {
		//constructor must be private
		aSymbol = pSymbol;
	}
	
	public enum Color {RED, BLACK};
	
	/* we shouldn't use primitive type like String to indicate only two possibilities */
	public Color color() {
		/* ch4 explains why we don't use .equal() */
		if(this == DIAMONDS || this == HEARTS) {
			return Color.RED;
		} else {
			return Color.BLACK;
		}
	}
	public String toString() {
		return name().substring(0,1) + name().substring(1).toLowerCase();
	}
	
}
