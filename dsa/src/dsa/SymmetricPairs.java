package dsa;

import java.util.HashMap;
import java.util.Map;

public class SymmetricPairs {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 2, 1, 5};
		System.out.println("Array: ");
		for(int num : arr) {
			System.out.println(num + "");
		}
		System.out.println();
		System.out.println("SymmetricPairs:");
		findSymmetricPairs(arr);
	}

	private static void findSymmetricPairs(int[] arr) {
		if(arr == null || arr.length ==0) {
			System.out.println("Array is empty or null");
			return;
		}
		//store each element and its corresponding index in a HashMap.
		Map<Integer, Integer> map = new HashMap<>();
		//value exists in the HashMap
		for(int i = 0; i< arr.length; i++) {
			int currentElement = arr[i];
			if(map.containsKey(currentElement)) {
				int index = map.get(currentElement);
				if(index != i) {
					System.out.println("Found: (" + currentElement + ",  " + arr[index] + ")");
				}
			} else {
				map.put(currentElement, i);
			}
		}
		
	}

}
/*

SymmetricPairs
SymmetricPairsUsingStreams {1,2,4,3,2,1} o/P {1,2}, {2,1}
To find all symmetric pairs in an array using Java, 
you can iterate through the array and store each element
and its corresponding index in a HashMap. 
Then, for each element in the array, 
check if its value exists in the HashMap and 
if the index stored in the HashMap for that value is not the same as the current index. 
If both conditions are met, it means you have found a symmetric pair.

*/