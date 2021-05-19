package calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
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
	
		//Allow Add empty string returns 0
		assertEquals(calc.Add(""), 0);
		
		//Allow Add one string returns 1
		assertEquals(calc.Add("1"), 1);
		
		//Allow Add two string returns sum
		assertEquals(calc.Add("1,2"), 3);
		
		//Allow Add unknown amount of numbers
		assertEquals(calc.Add("1,2,3,5,1"), 12);
		
		
		//Allow Add method to handle new lines between numbers (instead of commas)
		assertEquals(calc.Add("1,2,3"), 6);
		assertEquals(calc.Add("1\n2\n3"), 6);
			//Invalid Check
			//assertEquals(calc.Add("1\n,2\n3"), 6)
		
	  //Support different delimiters
	  Assert.assertEquals(1+2+3, StringCalculator.addwithMultipleDelimiter("//;\n1;3;2"));		
	}
	

}
