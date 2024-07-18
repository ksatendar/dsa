package dsa;

public class RemoveSpaces {

	public static void main(String[] args) {
	String str ="He llo Wor ld .";
	String result = removeSpaces(str);
	System.out.println(result);
	}

	private static String removeSpaces(String str) {
			return str.replaceAll("\\s", "");
	}
}
