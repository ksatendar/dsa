package dsa;

public class FindSmallestNumber {

	public static void main(String[] args) {
		int[] numbers = {5,6,3,7,23,9,10};
		int smallest = findSmallestNumber(numbers);
		System.out.println("Smallest number in array is:" + smallest);
	}
	
	private static int findSmallestNumber(int[] arr) {
		//check if the array is empty
		if(arr == null || arr.length ==0) {
			throw new IllegalArgumentException("Empty Array");
		}
		
		//Initialize the minimum value with first element in the array
		int smallest = arr[0];
		//Iterate through the array to find the smallest
		for(int i=1; i<arr.length; i++) {
			if(arr[i] < smallest) {
				smallest = arr[i];
			}
		}
		return smallest;
	}
}
