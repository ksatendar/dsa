package dsa;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PrintDuplicatesFromString {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		String input = "Hello World";
		//Step 1: Group char by count
		Map<Character, Long> charCounts = 
				input.chars() //Convert the string to an IntStream of Character
				.mapToObj(c -> (char) c) //Convert each character code to character object
				.collect(Collectors.groupingBy( //Collect the character into a map, grouped by character and counted
						Function.identity(), //Grouping by the character itself
						Collectors.counting())); //Count the occurrences of each character

		//Step 2: Print characters with count > 1
		System.out.println("Duplicates are: ");
		charCounts.entrySet().stream() // Convert the map to a stream of entries
		.filter(entry -> entry.getValue() > 1) // Filter entries with count greater than 1
		.forEach(entry -> System.out.println(entry.getKey()));//Print the character
		
	}
}
