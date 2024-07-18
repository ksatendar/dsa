package dsa;

public class SmallestNumberArray {

	public static void main(String[] args) {

		int[] numbers = {5,3,8,1,7,2,4};
		int smallest = smallestNumberArray(numbers);
		System.out.println("The smallest number in the array is : " + smallest);
	}

	private static int smallestNumberArray(int[] arr) {
		//Check if the array is empty
		if(arr == null || arr.length == 0) {
			throw new IllegalArgumentException("Array is empty");
		}
		
		//Initialize the minimum value with the first element of the array
		int smallest = arr[0];
		//Iterate through the array to find the smallest element
		for(int i = 1; i<arr.length; i++) {
			if(arr[i] < smallest) {
				smallest = arr[i];
			}
			
		}
		
		return smallest;
		
	}

}
