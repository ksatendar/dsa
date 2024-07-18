package dsa;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

/*
Java program that finds the largest word in a given string using Java Stream and collections:
We split the input string into words using split("\\s+"), which splits the string based on one or more whitespace characters.
We use Arrays.stream() to create a stream of words.
We use the max() function along with a comparator to find the maximum element in the stream based on the length of the words.
Finally, we return the largest word found, or an empty string if no words are present.
 */
public class LargestWord {

	public static void main(String[] args) {
		String inputString = "This is a sample strings";
		String largestWord = findLargestWord(inputString);
		System.out.println("Result is :" +largestWord);
	}

	public static String findLargestWord(String inputString) {
		Optional<String> largestWord = 
				Arrays.stream(inputString.split("\\s+"))
				.max(Comparator.comparingInt(String::length));

		return largestWord.orElse("");
	}

	
}
