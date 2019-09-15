package lec01;

import java.util.HashMap;
import java.util.Map;

public class SelfAssessment {
	private static final String TEXT = "Lorem ipsum dolor sit amet, "
			+ "consectetur adipiscing elit. Nunc quis tempor tellus. Nulla "
			+ "tincidunt pretium justo non finibus. Fusce quis bibendum ante. "
			+ "Vivamus a ex maximus, iaculis nunc eu, posuere augue. Vestibulum "
			+ "ante ipsum primis in faucibus orci luctus et ultrices posuere "
			+ "cubilia Curae; Nullam ut lorem metus. Vivamus consequat eros "
			+ "sed lorem rhoncus finibus. Sed porta euismod consequat. Etiam "
			+ "sodales accumsan nulla, non pretium ex tincidunt eget. Aliquam "
			+ "nibh erat, tristique vel augue sit amet, sodales sollicitudin leo. "
			+ "Mauris in arcu volutpat, efficitur erat imperdiet, finibus dolor. "
			+ "Vestibulum a dolor sed justo tempor elementum. Pellentesque eu "
			+ "tincidunt ex, et posuere orci. Phasellus non nibh non nibh pharetra "
			+ "lobortis. ";
	
	private static Map<String,Integer> map = new HashMap<String,Integer>();
	
	public static void main(String[] args) {
		String word=calculate(TEXT);
		System.out.println("Most frequent: "+"\""+word+"\""+" ("+map.get(word)+" occurences"+")");
	}
	
	/**
	 * Returns the most frequent word in a String.
	 * @param s String 
	 * @return 
	 */
	public static String calculate(String s) {
		String result = "";
		int counter=0;
		for(String str: s.toLowerCase().split("[\\.,\\t\\s]+")) {
			if(map.putIfAbsent(str,1)!=null) map.put(str,map.get(str)+1);
			if(map.get(str)>counter) {
				counter=map.get(str);
				result=str;
			}
		}
		return result;
	}

}
