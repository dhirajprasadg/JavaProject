package corejava.oops.recursion;

public class RecursionExample3 {

	static int factorial(int n) {
		if (n == 1) {
			System.out.println(" n value is 1 change it to more than one ");
			return 1;
		} else {
			System.out.println(" else funciton called with value of n : " + n );
			return (n * factorial(n - 1));
		}
	}

	public static void main(String[] args) {

		System.out.println(" Factorial of n number : "  + factorial(4));

		System.out.println(" Factorial of n number : "  + factorial(5));

	}

}
