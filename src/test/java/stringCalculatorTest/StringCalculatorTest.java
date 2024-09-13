package stringCalculatorTest;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import stringCalculator.StringCalculator;
import stringCalculator.NegativeNumberException;

public class StringCalculatorTest {

	StringCalculator calculator = new StringCalculator();
	@Test
	public void testEmptyString() throws Exception{	
		assertEquals(0, calculator.add(""));
	}
	
	 @Test
	    public void testSingleNumber() throws Exception {
	        assertEquals(1, calculator.add("1"));
	    }
	 
	 @Test
	 public void testTwoNumbers() throws Exception{
		 assertEquals(6, calculator.add("2,4"));
	 }
	 
	 @Test
	 public void testMultipleNumbers() throws Exception{
		 assertEquals(17, calculator.add("2,4,3,8"));
	 }
	 
	 @Test
	    public void testNewLineDelimiter() throws Exception {
	        assertEquals(9, calculator.add("1\n2,3,3"));
	    }
	 
	 @Test
	    public void testCustomDelimiter() throws Exception {
	        assertEquals(3, calculator.add("//;\n1;2"));
	    }
	 
	 @Test
	    public void testNegativeNumbers() {
	        Exception exception = assertThrows(NegativeNumberException.class, () -> {
	            calculator.add("1,-2,3,-4");
	        });
	        assertEquals("Negative numbers not allowed: [-2, -4]", exception.getMessage());
	    }
}
