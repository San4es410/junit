package junit;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(value = Parameterized.class)
public class CalculatorTestDivide extends Assert {
	private int firstNumber;
	private int secondNumber;
	private int result;
	
	public CalculatorTestDivide(int firstNumber, int secondNumber, int result) {
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
		this.result = result;
	}
	
	@Parameterized.Parameters(name = "{index}:divideOf({0}/{1})={2}")
	public static Iterable<Object[]> dataForTest() {
		return Arrays.asList(new Object[][] { { 20, 5, 4 }, { 30, 6, 5 }, { 100, 4, 25 }, { 33, 3, 11 } });
	}
	
	@Test
	public void testCalculatorDivide() {
		assertEquals(5, Calculator.getDivide(15, 3));
	}
	
	@Test
	public void testDivideWithParametres() {
		assertEquals(result, Calculator.getDivide(firstNumber, secondNumber));
	}

}
