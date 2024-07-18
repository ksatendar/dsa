package dsa;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeatingElements {

	public static void main(String[] args) {
		int[] array = {1,2,2,3,3,4,4,5,6,6,7,8,9,10};
		int[] nonRepeatingElements = findNonRepeatingElements(array);
		System.out.println("The non repeating element are : " + Arrays.toString(nonRepeatingElements));
		for(int element : nonRepeatingElements) {
			System.out.println("Final non repeating elements are :" + element);
		}
	}

	private static int[] findNonRepeatingElements(int[] array) {
	//Create a frequencyMap of Arrays element
		Map<Integer, Long> frequencyMap = Arrays.stream(array)
				.boxed() //int into an Integer object.
				.collect(Collectors.groupingBy(
						Function.identity(),
						Collectors.counting()
						)); //collect the elements into a map
		
		//Filter out the element with frequency :: 1 
		int[] nonRepeatingElements = frequencyMap.entrySet().stream()
				.filter(entry -> entry.getValue() == 1)
				.mapToInt(Map.Entry::getKey)// to convert the stream
				.toArray();
		
		return nonRepeatingElements;
	}

}


/*

arr is the input array.
We convert the array to a stream using Arrays.stream(arr).
We use the boxed() method to box each primitive int into an Integer object.
We collect the elements into a map where the key is the element itself, and the value is its frequency using Collectors.groupingBy() and Collectors.counting().
We filter out the entries in the map where the frequency is 1 using the filter() method.
Finally, we use mapToInt() to convert the stream of non-repeating elements to an int[] array.

*/