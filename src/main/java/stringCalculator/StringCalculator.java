package stringCalculator;
import java.util.*;

public class StringCalculator {

	public int add(String numbers) throws NegativeNumberException{
		
		//1. check empty String
		if(numbers.isEmpty()) {
			return 0;
		}
		
		//3. Allow the add method to handle new lines between numbers (instead of commas).
		String delimiter = ",|\n"; 
        String numbersPart = numbers;
        
        
        //4. Support different delimiters: 
        // To change the delimiter, the beginning of the string will contain a separate line that looks like this: "//[delimiter]\n[numbers…]". 
        if (numbers.startsWith("//")) {
            int delimiterIndex = numbers.indexOf("\n");
            delimiter = numbers.substring(2, delimiterIndex); 
            numbersPart = numbers.substring(delimiterIndex + 1);
        }
		
        
        //2. Allow to handle any number of inputs
		String[] numberArray = numbersPart.split(delimiter);
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

        //5. Throw exception if there are negative numbers
        if (!negativeNumbers.isEmpty()) {
            throw new NegativeNumberException("Negative numbers not allowed: " + negativeNumbers.toString());
        }
		
		return sum;
	}
}
