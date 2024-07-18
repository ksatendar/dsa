package dsa;

public class FindLargestNumber {

	public static void main(String[] args) {
		int[] numbers = {11,4,6,32,7,8,9};
		int largest = findLargestNumber(numbers);
		System.out.println("The Largest value in the Array :" + largest);
	}

	private static int findLargestNumber(int[] arr) {
		//Check for Empty array
		if(arr == null || arr.length == 0) {
			throw new IllegalArgumentException("Empty array");
		}
		//Initialize through the array for the maximum value.
		int largest = arr[0];
		//Iterate through the array to find the largest
		for(int i= 1; i<arr.length; i++) {
			if(arr[i] > largest) {
				largest = arr[i];
			}
		}
		return largest;
	}

}
