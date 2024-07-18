package dsa;
//Check if two strings match where one string contains wildcard characters::StringMatcher :: WildcardMatching

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WildcardMatching {

	public static void main(String[] args) {
		String pattern = "a*d*e";
		String text = "abcde";
		boolean isMatch = isStringMatchWildcardMatching(pattern, text);
		System.out.println("WildcardMatching : "+pattern+ " : " + text+ ":" +isMatch);
	}

	private static boolean isStringMatchWildcardMatching(String pattern, String text) {
		//Escape special character in the pattern and replace '*'
		String regex = pattern.replace(".", "\\.").replace("*", ".*");
		//Compile the regex pattern
		Pattern p = Pattern.compile(regex);
		//Create a matcher with the input text
		Matcher m = p.matcher(text);
		//Check text = pattern
		return m.matches();
	}
}

/*
The isMatchWithWildcard method takes two strings as input: the pattern with wildcard characters and the text to match against the pattern.
Inside this method, we escape special characters in the pattern using replace(".", "\\.").replace("*", ".*") and replace * with .*. This is because . and * are special characters in regular expressions.
We then compile the modified regex pattern using Pattern.compile(regex).
We create a Matcher object m with the input text using matcher(text).
Finally, we check if the text matches the pattern using matches() method of the Matcher object.

 */
