package lec12;

import org.junit.jupiter.api.Test;

public class TestProgram {
	@Test
	public void testGet_default() {
		assertSame(Show.DEFAULT, new Program().get(Day.FRIDAY));
	}

}
