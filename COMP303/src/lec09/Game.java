package lec09;

import lec07.Card;
import lec08.Deck;

public class Game {
	
	//"singleton" pattern
	private static Game INSTANCE = new Game();
	public static Game instance() {
		return INSTANCE;
	}
	private Deck aDeck = new Deck();
	private Game() {
		
	}
	public void draw() {
		
	}
	
	public void toTableau(Card card) {
		
	}
	
	public void toFoundation(Card card) {
		
	}
	
	public void newGame() {
		
	}

}
