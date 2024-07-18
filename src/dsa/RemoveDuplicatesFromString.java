package dsa;

import java.util.stream.Collectors;

public class RemoveDuplicatesFromString {
	
	public static void main(String[] args) {
		String input = "Hello World";
		

		String result= input.chars() //1
				.mapToObj(c -> (char) c) //2
				.distinct() //3
				.map(Object::toString) //4
				.collect(Collectors.joining()); //5

		System.out.println(result);
	}
}


/*
 Remove all duplicates from the input string::RemoveDuplicatesFromString

1. Convert the string to an IntStream of Characters
2. Convert each character code to a character object
3. Remove duplicates
4. Convert each character back to string
5. Join the characters back to a string

*/