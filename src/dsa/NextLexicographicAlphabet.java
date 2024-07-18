package dsa;

import java.util.stream.Collectors;

/*
 Lexicographic: a ->b ; c-> d
Convert the string to a stream of characters, map each character to the next alphabet, and collect back to a string:

input.chars(): This converts the string input to an IntStream of character codes.
.mapToObj(c -> (char) (c + 1)): Each character code is then mapped to the next alphabet by adding 1 to the character code and casting it back to a char.
.map(Object::toString): Convert each Character back to a String.
.collect(Collectors.joining()): Finally, the characters are collected and joined back into a string.
Print the result:

The resulting string with each letter changed to the next alphabet is printed to the console.
 

 */
public class NextLexicographicAlphabet {

	public static void main(String[] args) {
	String input ="ABC ABC";
	String result = input.chars()
			.mapToObj(c -> (char) (c+1))
			.map(Object::toString)
			.collect(Collectors.joining());

	System.out.println(result);
	}
}
