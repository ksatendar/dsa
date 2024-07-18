package dsa;
//Check if two strings match where one string contains wildcard characters::StringMatcher
//Check if two strings match where one string contains wildcard characters::StringMatcher :: WildcardMatching

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringMatcher {

	public static void main(String[] args) {
		String pattern = "a*d";
		String str1 = "abcd";
		String str2 = "axd";
		
		Boolean matchStr1 = isStringMatchWildcardMatching(str1, pattern);
		Boolean matchStr2 = isStringMatchWildcardMatching(str2, pattern);
		System.out.println(str1 + ":" + pattern + " : " + matchStr1);
		System.out.println(str2 + ":" + pattern + " : " + matchStr2);

	}
	
	private static boolean isStringMatchWildcardMatching(String str, String pattern) {
		//Escape special character in the pattern and replace '*'
		String regex = pattern.replace("*", ".*");
		//Compile the regex pattern
		Pattern p = Pattern.compile(regex);
		//Create a matcher with the input text
		Matcher m = p.matcher(str);
		//Check text = pattern
		return m.matches();
	}
}

