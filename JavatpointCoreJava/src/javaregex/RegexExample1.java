package javaregex;

import java.util.regex.*;

public class RegexExample1 {

	public static void main(String[] args) {
		// 1st way
		Pattern p = Pattern.compile(".s");// . represents single character
		Matcher m = p.matcher("as");
		boolean b = m.matches();

		// 2nd way
		boolean b2 = Pattern.compile(".s").matcher("as").matches();

		// 3rd way
		boolean b3 = Pattern.matches(".s", "as");
	//	\w matches boundaries between words
    // ^ matches the beginning of a line, and the $ matches the end of a line.
		boolean b4 = Pattern.matches("^This is a single line fan$", "This is a single line fan");
		boolean b5 = Pattern.matches("Dhiraj", " I am Dhiraj ");
       //A* quantifier means  matches the letter A zero or more times: Joh* matches the letter Joh zero or more time
	   // A+ quantifier meaning "one or more times ie A+ matches letter A one or more times
	   //a? quantifier meaning "zero or one time"
	   // .	Matches any single character. used only after character ie Jo. means it will match any single character after Jo  
	
		Pattern p1 = Pattern.compile("ohn*");// . represents single character
		Matcher m1 = p1.matcher("Johny went Joh for John_ a walk, and Joh4 fell down, and John hurt his knee.");
		
		// Matcher m1 = p1.matcher("This is a o singlec  445 line fan I am Dhiraj John This is a single line fan ");
		boolean ma = m1.matches();
		System.out.println("Matches : " + ma);
		while(m1.find()){
			System.out.println("------- Match found ------------ ");
			for (int i = 0; i <= m1.groupCount(); i++) {
				System.out.println(" Groups are : " + m1.group(i));
			}
			if (m1.group().length() != 0) {

				System.out.println(" Group trimmed: " + m1.group().trim());
			}

			System.out.println(" Start index: " + m1.start());

			System.out.println(" End index: " + m1.end());

		}
		
		
		//System.out.println(b + " " + b2 + " " + b3 + " /Boundary Matcher " + b4 + " Test \\ " + ma);
	}
}