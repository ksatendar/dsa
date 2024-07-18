package dsa;

import java.util.Arrays;

public class ReverseArray {
	public static void main(String[] args) {
		int[] numbers = {0,1,2,3,4,5};
	//	System.out.println("Original array: " + arrayToString(numbers));
		System.out.println("Original array: ");
		printArray(numbers);
		
		reverseArray(numbers);
	//	System.out.println("Reverse array: " + arrayToString(numbers));
		System.out.println("Reverse array: ");
		printArray(numbers);
	}



	private static void reverseArray(int[] arr) {
		// Check if the array is empty or has only one element or none
		if(arr == null || arr.length <2) {
			return;
			//No need in case of only 1 element present.
		}
		int start = 0;
		int end = arr.length -1;
		
		//Swap element from the beginning with the element from the end;
		while(start < end) {
			//swap element
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			//Move index toward the center
			start++;
			end--;
		}
	}
	
	private static void printArray(int[] arr) {
	Arrays.stream(arr).forEach(e -> System.out.println(e + " ")); 
		System.out.println();
	
}
	
//	private static void printArray(int[] arr) {
//		for(int num : arr) {
//			System.out.println(num + " " );
//		}
//	}
	
/*
	private static String arrayToString(int[] arr) {
		StringBuilder result = new StringBuilder("[");
		for(int i=0; i<arr.length; i++) {
			result.append(arr[i]);
			if(i < arr.length - 1) {
				result.append(", ");
			}
		}
		
		result.append("]");
		return result.toString();
	}
	*/

}
