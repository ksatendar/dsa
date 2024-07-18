package dsa;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class ArraySearchUsingStreams {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int target = 8;
		
		OptionalInt index = IntStream.range(0, arr.length)
				.filter(i -> arr[i] == target)
				.findFirst();
		
		if(index.isPresent()) {
			System.out.println("Target element: " + target + " found at index" + index.getAsInt());
		} else {
			System.out.println("Target element: " + target + " Not found");
		}

	}

}
