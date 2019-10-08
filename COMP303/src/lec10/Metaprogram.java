package lec10;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import lec02.Rank;
import lec05.Suit;
import lec07.Card;

public class Metaprogram {
	public static void main(String[] args) throws Exception{
		/*three ways of get a class*/
		Class<Card> cardClass = Card.class;
		//class literal: a reference to an object of class???
		
		Class<?> someClass = Class.forName("lec05.Card");
		
		Class<?> someOtherClass = Card.get(Rank.ACE, Suit.DIAMONDS).getClass();
		
		/* 
		 * "method" is a reference to an object of class Method that represent the 
		 * method getRank() in class Card.
		 */
		Method method = cardClass.getMethod("getRank");
		
		
//		Constructor<Card> constructor = cardClass.getConstructor(Rank.class,Suit.class);
//		Card card1 = Card.get(Rank.ACE, Suit.CLUBS);
//		constructor.setAccessible(true);
//		Card card2 = (Card) constructor.newInstance(Rank.ACE, Suit.CLUBS);
//		System.out.println(card1 == card2);
		
		
		
		Field field = cardClass.getDeclaredField("aRank");
		Card card = Card.get(Rank.EIGHT, Suit.DIAMONDS);
		field.setAccessible(true);
		field.set(card, Rank.ACE);
		System.out.println(card);
		//even if it's a private field, still can be changed by setAccessible
		
		/*
		 * "classClass" is a reference to an object of class Class that
		 * represent the ???
		 */
		Class<Class> classClass = Class.class;
		
//		field.set(null, true);
//		System.out.println(field.get(null));
		
//		for(Field field: cardClass.getDeclaredFields()) {
//			System.out.println(field);
//		}
		
//		System.out.println(isImmutable(Card.get(Rank.ACE, Suit.DIAMONDS)));
		
//		//return the name of all test methods
//		for(Method method: TestAbs.class.getDeclaredMethods()) {
//			
//		}
	}
	
	public static boolean isImmutable(Object pObject) {
		return pObject.getClass().getAnnotation(Immutable.class) != null;
	}
	
	public static boolean isOverride(Object pObject) {
		return pObject.getClass().getAnnotation(Override.class) != null;
		//cannot be detected since @Retention is Source
	}

}
