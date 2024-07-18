package dsa;

import java.util.Arrays;

public class RotateArrayBlockSwapAlgorithm {

	public static void main(String[] args) {
		// array is the input array, and k is the number of elements to rotate.
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int k = 5; // rotate array from here
		rotateArrayBlockSwapAlgorithm(arr, k);
		System.out.println("rotate array by " + k + " element : ");
		for(int num : arr) {
			System.out.print(num);
		}
	}

	private static void rotateArrayBlockSwapAlgorithm(int[] arr, int k) {
		int n = arr.length;
		// Handle the case where k is greater than n
		k = k % n;
		
		if(k < 0) {
			// Convert negative k to positive equivalent
			k += n;
		}
		 // Create subarrays for the elements to be rotated
		
		int[] subArray1 = Arrays.copyOfRange(arr, 0, n-k);
		int[] subArray2 = Arrays.copyOfRange(arr, n-k, n);
		//Concatenate now in reverse order
		
		int[] rotatedArray = concatenateArrays(subArray2, subArray1);
		//Copy the rotatedArray
		System.arraycopy(rotatedArray, 0, arr, 0, n);
	}

	private static int[] concatenateArrays(int[] arr1, int[] arr2) {
		// TODO Auto-generated method stub
		int[] result = new int[arr1.length + arr2.length];
		System.arraycopy(arr1, 0, result, 0, arr1.length);
		System.arraycopy(arr2, 0, result, arr1.length, arr2.length);
		return result;
	}

}

/*
arr is the input array, and k is the number of elements to rotate.
In the rotateArray method, we ensure that k is within the range [0, n) by taking the modulo n, where n is the length of the array.
We create two subarrays: one containing the first n - k elements and another containing the last k elements.
We concatenate these subarrays in reverse order to form the rotated array.
Finally, we copy the rotated array back to the original array.
*/