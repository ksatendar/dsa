package dsa;
public class Palindrome {

	public static void main(String[] args) {
		String str = "RADAR";

		if(isPalindrome(str)) {
			System.out.println(str + ": Yes it is Palindrome");
		}else {
			System.out.println(str + ": No it is not a Palindrome");
		}
	}
	//Method to check palindrome
	private static boolean isPalindrome(String str) {
		// Create a StringBuilder object and append the given string
		StringBuilder sb = new StringBuilder(str);
		//Reverse the string using StringBuilder reverse method()
		sb.reverse();
		//Convert the StringBuilder back to a string
		String reverseStr = sb.toString();
		//Compare the original with reverse string
		return str.equals(reverseStr);
	}
}
