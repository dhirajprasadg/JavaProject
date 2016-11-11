package javaregularexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
//https://www.youtube.com/watch?v=s_PfopWcMwI // Derek Banas// Java Video Tutorial 19
public class Regexoreilly {

	public static void main(String[] args) {

		String con1 = "   AAAa Derek Banas CA 12345 11111 PA (412)555-1212 DAA johnsmi Dhiraj {{{ {{ { ** & ... dhiraj_34@gmail.com";
		// Search for Word which is 2 to 20 Character in length which start with white space
		String regex = "\\s[A-Za-z]{3,20}\\s"; 
		// Search for Word which is 2 to 20 Character in length
		String regex1 = "[A-Za-z]{3,20}\\s"; 
		// Search for Zip code knowing it is 5 digit- give one result due to white space
		String regex2 = "\\s[0-9]{5}\\s"; 
		// Search for Zip code knowing it is 5 digit - give all result after removing white space
		String regex3 = "[0-9]{5}\\s"; 
		// Search for Zip code knowing it is 5 digit - alternative of  above
		String regex4 = "\\s\\d{5}\\s"; 
		String regex5 = "Dhiraj";      // search for sting 
		String regex6 = "A[KLRZ]";  // Search for A preceded by either K or L or R or Z .. this way we can search for state 
		String regex7 = "C[AOT]";  // Search for C preceded by either A or O or T
		String regex8 = "C[AOT]|A[KLRZ]"; // Either inserted by using |
		String regex9 = "(\\{{2,} )"; // Search for { with occurrence of 2 or more times
		String regex10 = "(\\{+ )"; // Search for { with occurrence of one or more times
		String regex11 = ".{3}"; // Search for anything with occurrence of 3
		String regex12 = ".CA\\s"; // Search for anything contain CA and after that space
		String regex13 = "\\w*";
		// dhiraj_34@gmail.com 
		String regex14 = "\\s\\w[A-Za-z0-9_]{5,20}@\\w[a-z]{2,5}\\.\\w[a-z]{1,3}";
		regexchecker(regex14, con1);
		stringToreplace(con1);
		matchRegnew();
		// [] - Any Character you want to Search, put it into []
		// [A-Z] - Search for A Character to Z Character
		// [0-9] - Search for 0 Character to 9 Character
		// [^A-C] - Not (^ ) ie Not search for A Character to C Character
		// [cde]   -  find match for c character , d character and e character individually
		// \\s - Search for White Space ie backslace twice with s -- i.e \\s
		// \\S - not WhiteSpace ie -- search for no whitespace
		// {n,m} - anything proceeds n to m times -- where n is mininum and m is
		// maximum
		// \\w - search for Any word character, short for [a-zA-Z_0-9] In Java, \w is limited to [A-Za-z0-9_] 
		// \\w{2,20} - any word Character that match occurance from 2 to 20
		// \\w[A-Aa-z0-9_] search for anything within specified limit [A-Aa-z0-9_] \\W -not search for ie just opposite of \\w
		// \\d - find any degit or number
		// \\D - find not degit or number
		// {5} - you want to find anything that occured very specific number of times say 5 times
		// \\d{2,5} any degit that match 2 to 5 in length 
		// {n,} - search by n minimum no maximum times
		// +    - if + precede after search term, it means Whatever searching  must be one or more times
		// *    search for zero or more times ie same as above except it search for occurance of zero or more times
		// X ?	X occurs once or not at all
		//  .  ^  *  +  ?  {}  []  \  |  ()  --- when we search for these things we need to put two forward slash ex \\{
		//  .  - search for any character ex .{3} search for any character with occurrence of 3
		//  .  - Search for Any character (may or may not match terminator)
		
		
	}

	public static void regexchecker(String regularex, String content) {

		Pattern pt = Pattern.compile(regularex);

		System.out.println(" pattern object creatd using compile method with reg exp = " + pt);

		Matcher mc = pt.matcher(content);
        System.out.println(" Matcher object mc Created by passing  content insite the \n pattern pt object : " + mc);
		System.out.println(" Group Count " + mc.groupCount());

		while (mc.find()) {

			System.out.println("------- Match found ------------ ");

			for (int i = 0; i <= mc.groupCount(); i++) {
				System.out.println(" Groups are : " + mc.group(i));
			}

			if (mc.group().length() != 0) {

				System.out.println(" Group trimmed: " + mc.group().trim());
			}

			System.out.println(" Start index: " + mc.start());

			System.out.println(" End index: " + mc.end());
		}
		System.out.println(" No Match found ");
	}

	public static void stringToreplace(String st2Re){
		System.out.println(" ------------------- stringToreplace----------------");
		System.out.println(" String(st2Re) : "+ st2Re );
		Pattern pt = Pattern.compile("\\s+");
		Matcher mch = pt.matcher(st2Re);
		System.out.println(" Matcher object value : " + mch);
		System.out.println(" Matcher object value : " + mch.find());
		System.out.println( " st2Re.trim() Value : " + st2Re.trim()); // remove the space from starting and end of string
		Matcher mchher = pt.matcher(st2Re.trim());
		System.out.println(" 2nd Matcher object value : " + mchher);
/*		while(mchher.find()){
			System.out.println(" Matcher start at : " + mchher.start());	
			System.out.println(" Matcher End at : " + mchher.end());
			System.out.println(" Matcher group trimed : " + mchher.group().trim() );
		}
*/			
	System.out.println(" White space replaced by: " + mchher.replaceAll("~~"));	
	System.out.println(" Matcher regionEnd() : " + mchher.regionEnd());	
	System.out.println(" Match End at : " + mchher.reset());	
	}
	
	public static void matchRegnew(){
		System.out.println("--------1st Way---------------------------- ");
		// Pattern pt = Pattern.compile("[cd]"); // find match for c character and d character
		Pattern pt = Pattern.compile("\\scd"); // space is also part of search and so it is match and getting replaced if you replace the match
 		Matcher mc = pt.matcher(" I am string cd where you need to find me  ");
		System.out.println(mc.replaceAll("dhiraj"));
		
		System.out.println("--------2nd Way---------------------------- ");
		String send = Pattern.compile("\\s\\*{2,3}").matcher(" this is test ** what && ****  *****").replaceAll(" STAR ");
		System.out.println( send);
		
		System.out.println("--------3rd Way---------------------------- ");
		boolean bol1= Pattern.compile(".s").matcher("as").matches();
		boolean bol = Pattern.matches(".s", "as");
		System.out.println(bol + " // "+ bol1);
	}
	
}
