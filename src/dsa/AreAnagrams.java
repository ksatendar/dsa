package dsa;

import java.util.Arrays;

public class AreAnagrams {

	public static void main(String[] args) {
		String str1 = "listen";
		String str2 = "silent";

		boolean areAnagrams = Arrays.equals(
				str1.chars().sorted().toArray(),
				str2.chars().sorted().toArray()
				);
		
		if(areAnagrams) {
			System.out.println("Yes it is ");
		}else {
			System.out.println("No");
		}
	}

}
