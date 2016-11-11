package exceptionhandeling;

public class Testtrycatch1 {

	public static void main(String[] args) {
		System.out.println("................ Single try and Catch block Example.................");
		try {
			int data = 50 / 0; // may throw exception
		} catch (ArithmeticException e) {
			System.out.println(e);
		}

		System.out.println("rest of the code...");
		
		System.out.println("................ Multiple Catch block Example.................");

		try {
			int a[] = new int[5];
			a[5] = 30 / 0;
		} /*catch (Exception e) {
			System.out.println("common task completed");
		}*/catch (ArithmeticException e) {
			System.out.println("task1 is completed");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("task 2 completed");
		} catch (Exception e) {
			System.out.println("common task completed");
		}finally{
			System.out.println(" It will run always");
		}

		System.out.println("rest of the code...");
	}

}
