package junit;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(value = Parameterized.class)
public class CalculatorTestMultiple extends Assert {
	private int firstNumber;
	private int secondNumber;
	private int result;

	public CalculatorTestMultiple(int firstNumber, int secondNumber, int result) {
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
		this.result = result;
	}

	@Parameterized.Parameters(name = "{index}:multipleOf({0}*{1})={2}")
	public static Iterable<Object[]> dataForTest() {
		return Arrays.asList(new Object[][] { { 3, 3, 9 }, { 5, 6, 30 }, { 3, 8, 24 }, { 4, 6, 24 } });
	}

	@Test
	public void testCalculatorMultiple() {
		assertEquals(200, Calculator.getMultiple(50, 4));
	}

	@Test
	public void testMultipleWithParametres() {
		assertEquals(result, Calculator.getMultiple(firstNumber, secondNumber));
	}

}
