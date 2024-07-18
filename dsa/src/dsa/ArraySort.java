package dsa;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,66,77,88,99};
		rearrangeArray(arr);
		System.out.println("rearrangeArray :" + Arrays.toString(arr));
	}

	private static void rearrangeArray(int[] arr) {
		Arrays.sort(arr);
		int[] temp = new int[arr.length];
		int left = 0, right = arr.length -1;
		int index =0;
		while(left <= right) {
			if(index % 2 ==0) {
				temp[index++] = arr[left++];
			}else {
				temp[index++] = arr[right--];
			}
		}
		// Copy the rearranged elements back to the original array
		System.arraycopy(temp, 0, arr, 0 , temp.length);
	}
}

/*
Sort the array in increasing order.
Divide the sorted array into two halves.
Reverse the second half of the sorted array.
Merge the two halves alternatively to get the final rearranged array.
*/