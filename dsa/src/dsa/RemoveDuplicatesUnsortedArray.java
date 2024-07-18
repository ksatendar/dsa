package dsa;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicatesUnsortedArray {

	public static void main(String[] args) {
		int[] unsortedArray = {2,2,2,1,1,9,5,5,5,7,7,7,4,4,3,3,3,8};
		int[] result = removeDuplicatesUnsortedArray(unsortedArray);
		System.out.println("Duplicate removed from unsortedArray : " + Arrays.toString(result));

	}

	private static int[] removeDuplicatesUnsortedArray(int[] unsortedArray) {
	
		/*
		return Arrays.stream(unsortedArray)
				.distinct()
				.toArray();
		*/
		
		//Convert the arrays to a stream then collect distinct element into a set
		Set<Integer> uniqueElement = Arrays.stream(unsortedArray).boxed().collect(Collectors.toSet());
		
		//convert the set back to arrays
		return uniqueElement.stream().mapToInt(Integer::intValue).toArray();
		
	}

}

/*
We convert the int array to a stream using Arrays.stream().
We call distinct() to remove duplicate elements from the stream.
boxed() : Convert int to Integer
 .mapToInt(Integer::intValue) // Convert Integer back to int
We collect the distinct elements into a Set using Collectors.toSet(). Since a Set cannot contain duplicate elements, this automatically removes duplicates.
Finally, we convert the Set back to an int array by converting each element of the Set to int using mapToInt() and toArray().

*/
