package stringCalculator;
import java.util.*;

public class StringCalculator {

	public int add(String numbers) throws NegativeNumberException{
		
		if(numbers.isEmpty()) {
			return 0;
		}
		
		String[] numberArray = numbers.split(",");
		int sum = 0;
		List<Integer> negativeNumbers = new ArrayList<>();

        for (String number : numberArray) {
            if (!number.isEmpty()) {
                int num = Integer.parseInt(number.trim());

                if (num < 0) {
                    negativeNumbers.add(num);  // Collect negative numbers
                }

                sum += num;
            }
        }

        // Throw exception if there are negative numbers
        if (!negativeNumbers.isEmpty()) {
            throw new NegativeNumberException("Negative numbers not allowed: " + negativeNumbers.toString());
        }
		
		return sum;
	}
}
