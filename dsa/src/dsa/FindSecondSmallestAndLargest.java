package dsa;

public class FindSecondSmallestAndLargest {

	public static void main(String[] args) {
		int[] numbers = {5,3,2,8,7,9,1};
		int secondSmallest = findSecondSmallest(numbers);
		int secondLargest = findSecondLargest(numbers);
		System.out.println("2nd smallest: " + secondSmallest);
		System.out.println("2nd smallest: " + secondLargest);
	}

	private static int findSecondSmallest(int[] arr) {
		// check if the arr is empty of have only one element
		if(arr == null || arr.length < 2) {
			throw new IllegalArgumentException("arr is empty of have only one element");
		}
		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] < smallest) {
				secondSmallest = smallest;
				smallest = arr[i];
			} else if(arr[i] < secondSmallest && arr[i] !=smallest) {
				secondSmallest = arr[i];
			}
		}
		return secondSmallest;
	}
	
	private static int findSecondLargest(int[] arr) {
		//check if the arr is empty of have only one element
		if(arr == null || arr.length < 2) {
			throw new IllegalArgumentException("arr is empty of have only one element");
		}
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		
		//iterate through the array to find the 2nd largest
		for(int i=0; i< arr.length; i++  ) {
			if(arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			} else if(arr[i] > secondLargest && arr[i]!=largest) {
				secondLargest = arr[i];
			}
		}
		return secondLargest;
	}
	

}
