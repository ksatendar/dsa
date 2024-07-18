package dsa;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//Return maximum occurring character in the input string:: MaxOccurringCharacterShort
public class MaxOccurringCharacterShort {

	public static void main(String[] args) {
		String input = "AAA BBBB CCCCCC";
		char maxChar = getMaxOccurringChar(input);
		System.out.println("String that occurs the most numbers of times is :" + maxChar);
	}

	private static char getMaxOccurringChar(String str) {
		// TODO Auto-generated method stub
		
		return str.chars()
				.mapToObj(c -> (char) c)
				.collect(
						Collectors.groupingBy(
								Function.identity(),
								Collectors.counting()
								)
						)
				.entrySet()
				.stream()
				.max(Map.Entry.comparingByValue())
				.map(Map.Entry::getKey)
				.orElse('\0');
				
		
		/*
		return str.chars()
				.mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet()
				.stream()
				.max(Map.Entry.comparingByValue())
				.map(Map.Entry::getKey)
				.orElse('\0');
		*/
	}

}
