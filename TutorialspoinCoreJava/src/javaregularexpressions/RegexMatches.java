package javaregularexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches {

	public static void main(String args[]) {
		// String to be scanned to find the pattern.
		String line = "This order was placed for QT3000! OK?";
		String pattern = "(.*)(\\d+)(.*)";

		// Create a Pattern object
		Pattern r = Pattern.compile(pattern);

		// Now create matcher object.
		Matcher m = r.matcher(line);
		if (m.find()) {
			System.out.println("Total Group No : " + m.groupCount());
			for(int i =0 ; i < m.groupCount(); i++){
				System.out.println("Found value: " + m.group(i));	
			}
			
		} else {
			System.out.println("NO MATCH");
		}
	}

}
