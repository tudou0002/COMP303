package lec02;

/* public class Suit extends Enum */
public enum Suit 
{
	CLUBS, DIAMONDS, SPADES, HEARTS;
	
	public enum Color {RED, BLACK};

//  .name() is the predefined method to print the name of the field itself
//	public static void main(String[] args) {
//		System.out.println(CLUBS.name());
//		
//	}
	
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
