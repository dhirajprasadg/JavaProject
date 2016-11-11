package wrapperclasspackage;

public class Wrapperclass {

	public static void main(String[] args) {
		
		int number = 5;
		System.out.println(" Wrapper Class Integer : " + number);
		Integer it = new Integer(5);
		System.out.println(" Wrapper Class Integer : " + it);
		System.out.println(" Wrapper Class Integer : " + it.intValue());
		
		System.out.println(" ---------- Primitive to Wrapper------------- "); 
		int number1 = 6;
		Integer it1 = Integer.valueOf(number1); //converting int into Integer 
		
		Integer j = number1; //autoboxing , now compiler write Integer.valueOf(number1) internally
		System.out.println( " Value : " + number1 + " // " + it1 + " // " + j);
		
		System.out.println(" ------ Wrapper to Primitive---------------");
		
		Integer a=new Integer(3);    
		int i=a.intValue();//converting Integer to int  
		int ja=a;//unboxing, now compiler will write a.intValue() internally    
		    
		System.out.println(a+" "+i+" "+ja);
		
	}

}
