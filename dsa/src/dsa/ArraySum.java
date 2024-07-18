package dsa;

import java.util.Arrays;

public class ArraySum {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,10};
		int sum = arraySum(arr);
		System.out.println("Array Sum is:" + sum);
	}

	private static int arraySum(int[] arr) {
		return Arrays.stream(arr).sum();
	}

}
