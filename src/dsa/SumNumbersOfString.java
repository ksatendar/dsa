package dsa;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SumNumbersOfString {

	public static void main(String[] args) {
		String input= "One 1 Lead , 2 DB with Frontend and 3 Java";
		int sum = sumNumbersOfString(input);
		System.out.println("Total sum of the number is a string : " + sum);
	}

	private static int sumNumbersOfString(String input) {
		int sum = 0;
		//Regular pattern to match number
		Pattern pattern = Pattern.compile("\\d+");
		Matcher matcher = pattern.matcher(input);
		
		//Iterate through each match and sum the numbers
		while(matcher.find()) {
			sum += Integer.parseInt(matcher.group());
		}
		return sum;
	}

}

/*
 * 
 In this program:

We define a sumNumbersInString method that takes a string as input and returns the sum of the numbers in that string.

Inside this method, we create a Pattern object using a regular expression \d+ to match one or more digits.

We then create a Matcher object by calling matcher() on the pattern and passing the input string.

Using a while loop and find() method of the Matcher object, we iterate through each match of the pattern in the input string.

Inside the loop, we extract the matched number using group() method and convert it to an integer using Integer.parseInt(), then add it to the sum.

Finally, we return the sum of all the numbers found in the string.

You can modify the input string input in the main method according to your requirements.
 */