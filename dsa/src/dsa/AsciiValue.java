package dsa;

public class AsciiValue {

	public static void main(String[] args) {
		char ch ='B';
		int asciiValue = findAsciiValue(ch);
		System.out.println("The Ascii value of " + ch + " is : " +asciiValue);

	}

	private static int findAsciiValue(char ch) {
		// TODO Auto-generated method stub
		return (int) ch;
	}

}
