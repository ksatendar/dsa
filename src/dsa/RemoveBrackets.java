package dsa;

public class RemoveBrackets {

	public static void main(String[] args) {
		String expression = "(a+b)*(c-d)";
		String result = expression.replaceAll("[()]", "");
		System.out.println(result);
	}

}
