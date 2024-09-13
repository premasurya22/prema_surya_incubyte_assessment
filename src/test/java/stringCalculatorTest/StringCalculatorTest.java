package stringCalculatorTest;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import stringCalculator.StringCalculator;
import stringCalculator.NegativeNumberException;

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
	        assertEquals(9, calculator.add("1\n2,3,3"));
	    }
	 
	 @Test
	    public void testCustomDelimiter() throws Exception {
	        StringCalculator calculator = new StringCalculator();
	        assertEquals(3, calculator.add("//;\n1;2"));
	    }
	 
	 @Test
	    public void testNegativeNumbers() {
	        StringCalculator calculator = new StringCalculator();
	        Exception exception = assertThrows(NegativeNumberException.class, () -> {
	            calculator.add("1,-2,3,-4");
	        });

	        assertEquals("Negative numbers not allowed: [-2, -4]", exception.getMessage());
	    }
}
