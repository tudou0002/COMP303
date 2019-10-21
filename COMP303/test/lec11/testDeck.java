package lec11;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import lec02.Rank;
import lec05.Suit;
import lec07.Card;




public class testDeck {
	
	//test fixture
	private Deck aFullDeck;
	private Deck aEmptyDeck;
	
	private static class StubComparator implements Comparator<Card>{
		private boolean aTriggered = false;
		public boolean triggered() {return aTriggered;}
		
		@Override
		public int compare(Card o1, Card o2) {
			aTriggered = true;
			return 0;
		}
		
	}
	
	private static int size(Deck pDeck) {
		int result = 0;
		for(Card card: pDeck) {
			result++;
		}
		return result;
	}
	
	@Test
	public void testDraw_Full() {
		assertNotNull(aFullDeck.draw());
		
	}
	
	//use reflection to 
	private static Card top(Deck pDeck) throws RuntimeException{
		try {
			Field field = lec02.Deck.class.getDeclaredField("aCards");
			field.setAccessible(true);
			List<Card> cards = (List<Card>) field.get(pDeck);
			return cards.get(cards.size());
		}catch (Exception e){
			throw new RuntimeException(e);
		}
	}
	
	@BeforeEach
	//JUnit4 is @Before
	public void setup() {
		//injection
		aFullDeck = new Deck();
		aEmptyDeck = new Deck();
		while(aEmptyDeck.isEmpty()) {
			aEmptyDeck.draw();
		}
		assert size(aEmptyDeck) == 0;
	}
	
	@Test
	public void testSort() {
		//sort() is the modified method in Deck using dependency injection
		StubComparator c = new StubComparator();
		Deck deck = new Deck(c);
		deck.sort();
		assertTrue(c.triggered());
	}
	
	@Test
	public void testDraw_Empty() {
		//self-defined exception class
		assertThrows(EmptyDeckException.class, new Executable() {

			@Override
			public void execute() throws Throwable {
				aEmptyDeck.draw();
			}
			
		});
		
	}
	
	@Test
	public void testDraw_Full_NotNull() {
		assertNotNull(aFullDeck.draw());
	}
	
	@Test
	public void testDraw_Full_Full() {
		
		assert size(aFullDeck) ==52;
		
		while( !aFullDeck.isEmpty()) {
			int size = size(aFullDeck);
			Card top = top(aFullDeck);
			Card newCard = aFullDeck.draw();
			assertEquals(size-1, size(aFullDeck));
			assertSame(top, newCard);
		}
		
		//open question: two ways which is better
//		deck.draw();
//		assertEquals(51,size(deck));
//		Card top = top(deck);
//		assertSame(top,deck.draw());
	}
	
	//how to test a private method
	@Test
	public void testInitialize() throws Exception {
		Class<Deck> deckClass = Deck.class;
		Method method = deckClass.getDeclaredMethod("initialize");
		method.setAccessible(true);
		method.invoke(aEmptyDeck); //aEmptyDeck.initialize()
		Iterator<Card> iter = aEmptyDeck.iterator();
		for( Rank rank : Rank.values()) {
			for(Suit suit: Suit.values()) {
				assertSame(Card.get(rank, suit), iter.next());
			}
		}
		}
	
	@Test
	public void testHas_EmptyDeck() {
		assertFalse(aEmptyDeck.hasOnlyDiamondFaceCards());
	}
	
	private static void setupDeck(Deck pDeck, Card...pCards) {
		try {
			Field field = lec02.Deck.class.getDeclaredField("aCards");
			field.setAccessible(true);
			List<Card> cards = (List<Card>) field.get(pDeck);
			cards.clear();
			cards.addAll(Arrays.asList(pCards));
		}catch (Exception e){
			throw new RuntimeException(e);
		}
	}
	
	
	@Test
	public void testHas_NotEmpty_DiamondFirstCard() {
		Deck deck = new Deck(null);
		setupDeck(deck,Card.get(Rank.ACE, Suit.DIAMONDS));
		assertFalse(deck.hasOnlyDiamondFaceCards());
	}
	
	@Test
	public void testHas_NotEmpty_NotDiamondFirstCard() {
		Deck deck = new Deck(null);
		setupDeck(deck,Card.get(Rank.ACE, Suit.DIAMONDS));
		assertFalse(deck.hasOnlyDiamondFaceCards());
	}
	
	@Test
	public void testHas_NotEmpty_DiamondFaceCard() {
		Deck deck = new Deck(null);
		setupDeck(deck, Card.get(Rank.KING, Suit.DIAMONDS));
		assertTrue(deck.hasOnlyDiamondFaceCards());
	}
	

}
