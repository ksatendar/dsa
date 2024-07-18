package dsa;

import java.util.stream.Collectors;

public class ReverseString {

	public static void main(String[] args) {
		
	/*	
		String str= "Hello world";
		String result= reverseString(str);
		System.out.println("Original :" + str);
		System.out.println("Reverse :" + result);

	}

	private static String reverseString(String str) {
		// Create a StringBuilder object and append the given string
		StringBuilder sb = new StringBuilder(str);
		//Use the reverse method
		sb.reverse();
		//Convert the StringBuilder back to the a string
		return sb.toString();
	}
	*/

String originalString = "Hello World";
String reversedString = new StringBuilder(originalString)
						.chars()
						.mapToObj(c -> (char) c)
						.collect(Collectors.
						collectingAndThen(
						Collectors.toList(),
						list -> {
							java.util.Collections.reverse(list);
							return list.stream().map(Object::toString).
							collect(Collectors.joining());
							}
						));
						
		System.out.println("Original :" + originalString);
		System.out.println("Reverse :" + reversedString);
		
/*
 String originalString = "Hello, World!";
        
        String reversedString = new StringBuilder(originalString)
                                    .chars()
                                    .mapToObj(c -> (char) c)
                                    .collect(Collectors.collectingAndThen(
                                        Collectors.toList(),
                                        list -> {
                                            java.util.Collections.reverse(list);
                                            return list.stream().map(Object::toString).collect(Collectors.joining());
                                        }
                                    ));

        System.out.println("Original String: " + originalString);
        System.out.println("Reversed String: " + reversedString);
*/

}}
