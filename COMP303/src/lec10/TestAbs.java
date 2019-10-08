package lec10;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*error message: No test found using JUnit 5*/
import org.junit.jupiter.api.Test;

public class TestAbs {
	
	@Test
	public static void testAbs_MinValue() {
		//go read the java document
		assertEquals(Integer.MIN_VALUE, Math.abs(Integer.MIN_VALUE));
	}
	
	@Test
	public static void testAbs_Zero() {
		//go read the java document
		assertEquals(0, Math.abs(0));
	}
	
	@Test
	public static void main(String[] args) {
		testAbs_Zero();
		System.out.println("All test passed");
	}

}
