package dsa;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RepeatingElements {

	public static void main(String[] args) {

		int[] array = { 1, 1, 12, 12, 3, 3, 3, 3, 4, 4, 5 };
		int[] repeatingElements = findRepeatingElements(array);
		System.out.println("repeatingElements in arrys are :");
		for (int element : repeatingElements) {
			System.out.println(element + " ");
		}
	}

	private static int[] findRepeatingElements(int[] array) {

		Map<Integer, Long> frequencyMap = Arrays.stream(array).boxed()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		// Filter out elements with frequency greater than 1
		int[] repeatingElements = frequencyMap.entrySet().stream().filter(entry -> entry.getValue() > 1)
				.mapToInt(Map.Entry::getKey).toArray();

		return repeatingElements;
	}
}

/*
 * 
 * We convert the primitive integer array array to a stream of boxed integers
 * using Arrays.stream(array).boxed(). We use Collectors.groupingBy() to group
 * elements by their value and Collectors.counting() to count the occurrences of
 * each element, resulting in a Map<Integer, Long> where keys are elements and
 * values are their frequencies. We then use stream operations to filter the
 * entries of the map to keep only those with frequencies greater than 1.
 * Finally, we use mapToInt() to convert the stream of Integer keys back to a
 * stream of primitive ints, and toArray() to collect them into an array.
 * 
 */