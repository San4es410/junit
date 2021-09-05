package junit;

import org.junit.Assert;
import org.junit.Test;

public class MathSinTest extends Assert {
	
	@Test
	public void test() {
		assertEquals(0.5, Math.sin(0.52), 0.5);
	}
		

}
