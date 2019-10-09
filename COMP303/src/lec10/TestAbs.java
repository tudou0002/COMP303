package lec10;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*error message: No test found using JUnit 5*/
import org.junit.jupiter.api.Test;

public class TestAbs {
	/*must be public void , why*/
	
	@Test
	public void testAbs_MinValue() {
		//go read the java document
		assertEquals(Integer.MIN_VALUE, Math.abs(Integer.MIN_VALUE));
	}
	
	@Test
	public void testAbs_Zero() {
		//go read the java document
		assertEquals(0, Math.abs(0));
	}
	
	

}
