package dsa;

import java.util.Arrays;

/*
RemoveDuplicates
We convert the array to a stream using Arrays.stream().
We call distinct() to remove duplicates from the stream.
Finally, we collect the elements back into an array using toArray().

*/
public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] sortedArray = {1,1,1,2,2,2,2,3,4};
		int[] result = removeDuplicates(sortedArray);
		System.out.println("Duplicate removed: " + Arrays.toString(result));
	}

	private static int[] removeDuplicates(int[] sortedArray) {
		// TODO Auto-generated method stub
		return Arrays.stream(sortedArray)
				.distinct()
				.toArray();
	}
}
