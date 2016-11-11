package corejava.javaconversion;

public class StringtoInt {

	public static void main(String[] args) {
		String something = "200";
		

		int number = Integer.parseInt(something);

		System.out.println(" Sum of string and integer : " + (number + 300));

		System.out.println("-----------------------------");

		int temp1 = 300;
		String temp2 = String.valueOf(temp1);
		System.out.println(" Int converted to String : " + temp2 + 200);
		
		String temp3 = Integer.toString(temp1);
		System.out.println(" Int converted to String : " + temp3 + 800);
		
	}

}
