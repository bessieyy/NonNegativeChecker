package test;
import java.util.Random;

import org.junit.Test;

import NonNegChecker.NonNegative;

public class NonNegTest {

	@Test
	public void testNonNeg() {
		@SuppressWarnings("unused")
		@NonNegative int a = 4; // warning here
		@SuppressWarnings("unused")
		@NonNegative int c;
		Random r = new Random();
		int b = r.nextInt();
		if (b >= 0) {
			c = b; // legal
		}
		c = b; // warning here
	}
}
