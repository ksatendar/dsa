package dsa;

import java.util.HashMap;
import java.util.Map;
//use a HashMap to count the frequency of each element in an array

@SuppressWarnings("unused")
public class CountElementFrequency {

	public static void main(String[] args) {
		int[] myArray = {5, 3, 8, 1,1,1,1, 7, 2, 4, 5, 3, 1, 4, 3, 7};
		
		//Create a hashmap to store element frequencies
		HashMap<Integer, Integer> elementFrequency = new HashMap<>();
		
		//Count the frequency of each element
		for(int element : myArray) {
			//If the element is already in the HashMap, increment its count
			if(elementFrequency.containsKey(element)) {
				elementFrequency.put(element, elementFrequency.get(element) + 1);
			} else {
				//If the element is not in the Hashmap, add it with a count of 1
				elementFrequency.put(element, 1);
			}
		}
			for(HashMap.Entry<Integer, Integer> entry : elementFrequency.entrySet()) {
				System.out.println(entry.getKey() + ":" + entry.getValue() + " times occurance");
			}
	}
}
