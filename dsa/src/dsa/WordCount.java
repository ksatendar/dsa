/*
Split the input string into words:

input.split("\\s+"): This splits the input string input into an array of words based on one or more whitespace characters.
Arrays.asList(...): This converts the array of words into a List<String>.
Count the number of words:

words.stream(): This converts the list of words to a stream of words.
.count(): This counts the number of elements in the stream, which corresponds to the number of words in the input string.
Print the word count:

The word count is printed to the console.
When you run this program with the input "Hello World! This is a test string.", it will output:

Number of words: 7
*/
package dsa;

import java.util.Arrays;
import java.util.List;

public class WordCount {

	public static void main(String[] args) {
		String input = "One two three four five six seven";
		
		List<String> words = Arrays.asList(input.split("\\s+"));
		Long wordCount = words.stream().count();
		System.out.println("Nos of words: " + wordCount);
	}
}





