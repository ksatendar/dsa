package dsa;

public class RemoveVowels {

	public static void main(String[] args) {
		String str ="Hello World! This a Java Program.";
		String result = removeVowels(str);
		System.out.println("New String upon removal of vowels is: " + result);
	}

	private static String removeVowels(String str) {
		return str.replaceAll("[aeiouAEIOU]", "");
	}
}
