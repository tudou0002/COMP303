package lec05;

import lec02.Suit.Color;
import java.lang.*;

public enum Suit 
{
	CLUBS(Character.toChars(U+2663)), DIAMONDS, SPADES, HEARTS;
	
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
