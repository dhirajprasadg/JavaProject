package exceptionhandeling;

public class Nestedtrycatchblock {

	public static void main(String[] args) {

		try {
			try {
				System.out.println("going to divide");
				int b = 39 / 0;
			} catch (ArithmeticException e) {
				System.out.println(e);
			}

			try {
				int a[] = new int[5];
				a[5] = 4;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}

			System.out.println("other statement");
		} catch (Exception e) {
			System.out.println("handeled");
		}

		System.out.println("normal flow..");

		System.out
				.println("..................Finall Block example.........................");
		try {
			int data = 25 / 5;
			System.out.println(data);
		} catch (NullPointerException e) {
			System.out.println(e);
		} finally {
			System.out.println("finally block is always executed");
		}
		System.out.println("rest of the code...");

		System.out.println("......... java finally block example where exception occurs and its handled.........");

		try {
			int data = 25 / 0;
			System.out.println(data);
		} catch (ArithmeticException e) {
			System.out.println(e);
		} finally {
			System.out.println("finally block is always executed");
		}
		System.out.println("rest of the code...");

		System.out.println("......... java finally block example where exception occurs and not handled............");

		try {
			int data = 25 / 0;
			System.out.println(data);
		} catch (NullPointerException e) {
			System.out.println(" Exception occured but it will not go here ");
			System.out.println(e);
		} finally {
			System.out.println("finally block is always executed");
		}
		System.out
				.println(" since exception is not handeled properly so finally block will run but next statement wont");
		System.out.println("rest of the code...");

	}
}
