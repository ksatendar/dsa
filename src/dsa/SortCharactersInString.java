/*
Write a program to sort characters in a string:: SortCharactersInString 
Convert the string to a stream of characters, sort them, and collect back to a string:

input.chars(): This converts the string input to an IntStream of character codes.
input.chars(): This converts the string input to an IntStream of Character codes. 
.mapToObj(c -> (char) c): Each character code is then converted to a Character object.
.mapToObj(c -> (char) c): Each character code is then converted to a Character object.
.sorted(): Characters are sorted lexicographically (based on their Unicode values).
.sorted(): Characters are sorted lexicographically
.map(Object::toString): Convert each Character back to a String.
.map(Object::toString): Convert each Character back to a String.
.collect(Collectors.joining()): Finally, the sorted characters are collected and joined back into a string.
.collect(Collectors.joining()): Finally, the sorted characters are collected and joined back into a string.
Print the sorted string:
Print the sorted string:

The sorted string is printed to the console.


*/
package dsa;

import java.util.stream.Collectors;

public class SortCharactersInString {

	public static void main(String[] args) {
	String input = "Hello World";
	String input2 = "34523HelloWorld";
	//Step 1: Convert the string to a stream of characters, 
	//sort them, and
	//collect back to a string
	String sortedString = input.chars()
			.mapToObj(c -> (char) c)
			.sorted()
			.map(Object::toString)
			.collect(Collectors.joining());
	
	String sortedString2 = input2.chars()
			.mapToObj(c -> (char) c)
			.sorted()
			.map(Object::toString)
			.collect(Collectors.joining());
	
	System.out.println(sortedString);
	System.out.println(sortedString2);

			
			

	}

}
