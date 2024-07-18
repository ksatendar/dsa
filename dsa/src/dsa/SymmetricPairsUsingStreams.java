package dsa;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SymmetricPairsUsingStreams {

	public static void main(String[] args) {
		int[] arr =  {1, 2, 3, 4, 2, 1, 5};
		Map<Integer, Integer> map = new HashMap<>();
		
		Arrays.stream(arr)
		.mapToObj(i -> new int[]{i, map.getOrDefault(i, -1)})
		.filter(pair -> pair[1] != -1 && pair[1] != pair[0])
		.forEach(pair -> System.out.println("Found SymmetricPairs: (" + pair[0] + ", " + arr[pair[1]] + ")"));


	}

}


/*
Arrays.stream(arr)//We first convert the array to a stream using Arrays.stream(arr).
.mapToObj(i -> new int[]{i, map.getOrDefault(i, -1)})//Then we map each element to an array where the first element is the current element and the second element is the index of its symmetric pair in the array
.filter(pair -> pair[1] != -1 && pair[1] != pair[0])//We filter out elements that don't have a symmetric pair or have a symmetric pair at the same index.
.forEach(pair -> System.out.println("SymmetricPairs: ("+ pair[0] +", " + arr[pair[1]] + ")"));//Finally, we print the symmetric pairs found.

*/