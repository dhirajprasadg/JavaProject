package corejava.string.stringbuffer;

public class StringBufferexample {
	

	public static void main(String[] args) {
		System.out.println(" This is String Buffer class : StringBuffer is mutable String and it is synchronised ");
		
		StringBuffer sf = new StringBuffer();
		sf.append(" Appended String ");
		StringBuffer sf1 = new StringBuffer(" Dhiraj ");
		sf1.append(" Kumar ");
		sf1.append(4.5);
		
		System.out.println(" String Buffer appended value \" : " + sf + " /// : " + sf1);
		sf1.replace(2, 8, "Javww");
		
		System.out.println(" String Buffer replace value : " + sf1);
		
		System.out.println(" StringBuffer Capacity : " + sf1.capacity());
		
		System.out.println("-------------------------------------------------");
		
		String st = "This is apple ";
		
		StringBuffer sbf = new StringBuffer(st);
		System.out.println(" Value of String in String Buffer : " + sbf );
	   System.out.println(" sbf.reverse() : " +  sbf.reverse()); 
	   System.out.println( " sbf.toString() : " + sbf.toString());
	   sbf.reverse();
	   String str =sbf.toString();
	   System.out.println(" stringfrombuf : " + str);
	   int in = str.indexOf("is");
	   System.out.println(" str.indexOf(\"is\") : " +  in);
		System.out.println(str.indexOf("ap"));
	System.out.println(" str.substring(1) : " + str.substring(2));
	System.out.println(" str.charAt(3) : " + str.charAt(3));
	char[] ch = str.toCharArray();
System.out.println(" str.toCharArray()" + ch);		
	}

}
