package calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


public class StringCalculatorTest {
	
	private StringCalculator calc;
	
	@Before
	public void load() {
		calc= new StringCalculator();
	}
	
	@Test
	public void addTwoStrings() {
		assertEquals(calc.Add(""), 0);
		assertEquals(calc.Add("1"), 1);
		assertEquals(calc.Add("1,2"), 3);
	}
	

}
