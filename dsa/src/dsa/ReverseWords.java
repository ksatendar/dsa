package dsa;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseWords {

	public static void main(String[] args) {
	String inputString ="Java Stream";
	String reversedString = reverseWords(inputString);
	System.out.println("Reverse word is: " + reversedString);
	}

	private static String reverseWords(String inputString) {
		// Split the input string into words
		List<String> words = Arrays.asList(inputString.split("\\s+"));
		//Reverse the words using Collection method
		Collections.reverse(words);
		//Join the reversed words back in to Single string using Java stream & collection
		String reversedString = words.stream().collect(Collectors.joining(""));
		return reversedString;
	}
}

/*
Java program that reverses the words in a string using Java Stream and collections

Split the Input String into Words:
We use the split("\\s+") method to split the input string into an array of words based on one or more whitespace characters.
This array of words is then converted to a List using Arrays.asList() method.
Reverse the Order of Words:

We use Collections.reverse() method to reverse the order of words in the List.
This reverses the sequence of words effectively.
Join the Reversed Words Back into a Single String:

We use Java Stream to process each word in the reversed List.
Using Collectors.joining(" "), we join the reversed words into a single string with spaces between them.
The " " parameter specifies the delimiter to be used between the joined elements.
Return the Reversed String:

The reversed string is returned as the final result.


*/