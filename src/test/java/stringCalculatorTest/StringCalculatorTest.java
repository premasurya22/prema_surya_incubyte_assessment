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
}
