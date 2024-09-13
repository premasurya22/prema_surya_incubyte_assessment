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
	
}
