package dsa;

public class RemoveNonAlphabetic {

	public static void main(String[] args) {
		String inputStr ="Hello 123 World!2345";
		String result = removeNonAlphabetic(inputStr);
		System.out.println(result);
	}

	private static String removeNonAlphabetic(String inputStr) {
		// regular express
		String regex = "[^a-zA-Z]";
		return inputStr.replaceAll(regex, "");
	}
}
