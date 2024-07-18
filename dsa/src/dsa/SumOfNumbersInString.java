package dsa;

public class SumOfNumbersInString {

	public static void main(String[] args) {
		String inputString = "abc1a2a3def";
		int sum = calculateSumOfNumbersInString(inputString);
		System.out.println(sum);

	}

	private static int calculateSumOfNumbersInString(String str) {
		int sum = 0;
		StringBuilder numStr = new StringBuilder();
		for(char c : str.toCharArray()) {
			if(Character.isDigit(c)) {
				numStr.append(c);
			} else {
				if(numStr.length() > 0) {
					sum += Integer.parseInt(numStr.toString());
					numStr.setLength(0);
				}
			}
		}
		if(numStr.length() > 0) {
			sum += Integer.parseInt(numStr.toString());
		}
		
		
		return sum;
	}

}
