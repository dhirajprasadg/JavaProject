package exceptionhandeling;

public class UncheckedorRuntimeException {
	static void validate(int age) {
		if (age < 18)
			throw new ArithmeticException("not valid print if age below 18");
		else
			System.out.println("welcome to vote");
	}

	public static void main(String[] args) {

		/*
		 * ArithmeticException example int a = 50 / 0;
		 * System.out.println(" A value " + a);
		 * 
		 * NullPointerException example String s=null;
		 * System.out.println(s.length());
		 * 
		 * NumberFormatException example String sn="abc"; int
		 * i=Integer.parseInt(sn);
		 * 
		 * ArrayIndexOutOfBoundsException int ary[]=new int[5]; ary[10]=50;
		 */
		validate(19);
		System.out.println("validate 19 age executeds now validate 13 age below");
		validate(13);
		System.out.println("rest of the code...");
	}

}
