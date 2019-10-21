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
		//class literal: .class -> safest
		//a reference to an instance of class Class that represent class Card
		
		Class<?> someClass = Class.forName("lec05.Card");
		//by java doc, use Class<?> if the class being modeled is unknown
		//Returns the Class object associated with the class or interface with the given string name.
		
		Class<?> someOtherClass = Card.get(Rank.ACE, Suit.DIAMONDS).getClass();
		
		//here, Card is an example of fly-weight object. Card.get(rank,suit) is the static access method
		//to create a new Card instance. 
		  
		//!!!!!!!!!!!!!!!!!!
		//.getClass():Returns the runtime class of this Object. A method in class Object ??
		 

		//"method" is a reference to an object of class Method that represent the 
		//method getRank() in class Card.
		 
		Method method = cardClass.getMethod("getRank");
		
		try {
		Constructor<Card> constructor = cardClass.getDeclaredConstructor(Rank.class,Suit.class);
		//!!!!!!!!!!!!!!!!!!!!!
		//Returns the Constructor object of the public constructor that matches the specified parameterTypes
		//an enum is a kind of class, an annotation is a kind of interface
		Card card1 = Card.get(Rank.ACE, Suit.CLUBS);
    	constructor.setAccessible(true); /*method inherited from class java.lang.reflect.AccessibleOject*/
		Card card2 = (Card) constructor.newInstance(Rank.ACE, Suit.CLUBS);
		System.out.println(card1 == card2);
		}
		catch ( ReflectiveOperationException e ) { e.printStackTrace(); }
		
		
		
		Field field = cardClass.getDeclaredField("aRank");
		Card card = Card.get(Rank.EIGHT, Suit.DIAMONDS);
		field.setAccessible(true);
		field.set(card, Rank.ACE);
		System.out.println(card);
		//even if it's a private field, still can be changed by setAccessible
		
		/*!!!!!!!!!!!!!!!!!!!!!!
		 * "classClass" is a reference to an instance of class Class that
		 * represent the class Class ???
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
