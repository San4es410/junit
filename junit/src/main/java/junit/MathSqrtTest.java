package junit;

import org.junit.Assert;
import org.junit.Test;

public class MathSqrtTest extends Assert {
	
	@Test
	public void test() {
		assertEquals(3, Math.sqrt(9), 0.1);
	}

}
