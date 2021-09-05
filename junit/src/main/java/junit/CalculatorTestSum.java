package junit;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(value = Parameterized.class)
public class CalculatorTestSum extends Assert {
	private int firstNumber;
	private int secondNumber;
	private int result;
	
	public CalculatorTestSum(int firstNumber, int secondNumber, int result) {
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
		this.result = result;
	}
	
	@Parameterized.Parameters(name = "{index}:sumf({0}+{1})={2}")
	public static Iterable<Object[]> dataForTest() {
		return Arrays.asList(new Object[][] { { 20, 5, 25 }, { 34, 6, 40 }, { 12, 6, 18 }, { 17, 14, 31 } });
	}

	@Test
	public void testCalculatorSum() {
		assertEquals(100, Calculator.getSum(45, 55));
	}
	
	@Test
	public void testDivideWithParametres() {
		assertEquals(result, Calculator.getSum(firstNumber, secondNumber));
	}

}
