package dsa;

import java.util.Arrays;

public class AddElementToArray {

	public static void main(String[] args) {
		int[] originalArray = {1,2,3,4};
		int newElement = 5;
		//add newElement to originalArray into newArry
		int[] newArray = addElementToArray(originalArray, newElement);
		
		System.out.println("Original: " + Arrays.toString(originalArray));
		System.out.println("Updated: " + Arrays.toString(newArray));
	}

	private static int[] addElementToArray(int[] array, int newElement) {
		
		// Create a new array with increased size
		int[] newArray= Arrays.copyOf(array, array.length + 1);
		// Add the new element at the end
		newArray[newArray.length - 1] = newElement;
		return newArray;
		
		
		
	}


}

/*
 AddElementToArray
 We define a method addElement() which takes the original array and the new element to be added.
Inside the method, we create a new array newArray with a size one greater than the original array using Arrays.copyOf().
We copy all elements from the original array to the new array using Arrays.copyOf().
We then assign the new element to the last index of the new array.
Finally, we return the new array with the added element. 
 
 */


