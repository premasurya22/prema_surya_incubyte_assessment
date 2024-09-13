package stringCalculatorTest;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import stringCalculator.StringCalculator;

public class StringCalculatorTest {

	@Test
	public void testEmptyString() throws Exception{
		StringCalculator calculator = new StringCalculator();
		assertEquals(0, calculator.add(""));
	}
	
	 @Test
	    public void testSingleNumber() throws Exception {
	        StringCalculator calculator = new StringCalculator();
	        assertEquals(1, calculator.add("1"));
	    }
	 
	 @Test
	 public void testTwoNumbers() throws Exception{
		 StringCalculator calculator = new StringCalculator();
		 assertEquals(6, calculator.add("2,4"));
	 }
	 
	 @Test
	 public void testMultipleNumbers() throws Exception{
		 StringCalculator calculator = new StringCalculator();
		 assertEquals(17, calculator.add("2,4,3,8"));
	 }
	 
	 @Test
	    public void testNewLineDelimiter() throws Exception {
	        StringCalculator calculator = new StringCalculator();
	        assertEquals(6, calculator.add("1\n2,3"));
	    }
}
