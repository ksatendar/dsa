package dsa;

public class CountCharacters {

	public static void main(String[] args) {
		String str = "Hello World! This is a Java Program.";
		int vowels = countVowels(str);
		int consonants = countConsonants(str);
		int spaces = countSpaces(str);

		System.out.println("Nos of vowels: "+ vowels);
		System.out.println("Nos of consonants: "+ consonants);
		System.out.println("Nos of spaces: "+ spaces);
	}

	private static int countSpaces(String str) {
			return (int) 
					str.chars()
					.filter(Character::isWhitespace)
					.count();
	}

	private static int countConsonants(String str) {
		return (int) 
				str.chars()
				.filter(c -> Character.isLetter(c) && "aeiouAEIOU".indexOf(c) !=-1)
				.count();
	}

	private static int countVowels(String str) {
		return (int) 
				str.chars()
				.filter(c -> "aeiouAEIOU".indexOf(c) !=-1)
				.count();
	}
}
