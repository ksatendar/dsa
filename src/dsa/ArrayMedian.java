package dsa;

import java.util.Arrays;

public class ArrayMedian {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		double median = arrayMedian(arr);
		System.out.println("Array median is :" + median);
	}

	private static double arrayMedian(int[] arr) {
		// Sort this array
		Arrays.sort(arr);
		int n = arr.length;
		return n % 2 == 0 ? (arr[n / 2 - 1] + arr[n / 2]) / 2.0 : arr[n / 2];
	/*
		if(n % 2 == 0) {
			 // If the number of elements is even, average the two middle elements
			return (arr[n / 2 - 1] + arr[n / 2])/2.0;
		} else {
			 // If the number of elements is odd, return the middle element
			return arr[n / 2];
		}
		*/
		
	}

}

/*

arr is the input array.
findMedian() is a method that takes the array as input and returns the median.
We calculate the length of the array n.
We sort the array using Arrays.sort(arr) to ensure that the elements are in ascending order.
If the number of elements is even (n % 2 == 0), we take the average of the two middle elements (arr[n / 2 - 1] and arr[n / 2]).
If the number of elements is odd, we return the middle element (arr[n / 2]).
Note that we use "/ 2.0" instead of "/ 2" to ensure that the division is performed with floating-point arithmetic, which gives us a more accurate median, especially if the array contains decimal values.

*/