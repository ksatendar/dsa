package dsa;

import java.util.Arrays;

public class ArrayAverage {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		double average = arrayAverage(arr);
		System.out.println("Average of the element is: " + average);
	}

	private static double arrayAverage(int[] arr) {
	return Arrays.stream(arr).average().orElse(Double.NaN);
	}

}
/*
arr is the input array.
calculateAverage() is a method that takes the array as input and returns the average of its elements.
Inside the method, we use Arrays.stream(arr) to convert the array into an IntStream.
Then we call the average() method on the stream to calculate the average of all elements.
If the stream is empty (which can happen if the array is empty), we use orElse(Double.NaN) to return Double.NaN as the default value.

*/