package javagenerics;

class Dabba {
	final String type = "Paper";
	String name;
	int dabbaid;

}

public class GenericClassBox<T, Y> {
	int number = 5;
	private T variablename;
	private Y name;

	void addint(int a, int b) {
		int sumint = this.number + a + b;
		System.out.println(" Sum Number : " + sumint);
	}

	public void addanytype(T anytype, Y anytyp) {
		this.variablename = anytype;
		this.name = anytyp;
		System.out.println(" Two type of Variable passed in this Class :"
				+ this.variablename + " // " + this.name);
	}

	public static <E> void printArray(E[] inputArray) {
		// Display array elements
		System.out.println(" Print Array Method with Generic Argument ");
		for (E element : inputArray) {

			System.out.printf("%s ", element);
		}
		System.out.println();
	}

	public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
		T max = x; // assume x is initially the largest

		if (y.compareTo(max) > 0) {
			max = y; // y is the largest so far
		}

		if (z.compareTo(max) > 0) {
			max = z; // z is the largest now
		}
		return max; // returns the largest object
	}

	public T getVariablename() {
		return this.variablename;
	}

	public static void main(String[] args) {

		GenericClassBox gc = new GenericClassBox();
		gc.addint(5, 5);

		Dabba db = new Dabba();
		db.name = " Mango";
		db.dabbaid = 22;

		System.out.println(" Created Dabba Name " + db.name + " // Dabba Id : "
				+ db.dabbaid);

		gc.addanytype(" Stringpassed ", " Mohan ");

		System.out.println(" Geneic Class Box addanytype Method used : "
				+ gc.getVariablename());

		Integer[] intArray = { 1, 2, 3, 4, 5 };
		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
		Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

		System.out.println("Array integerArray contains:");
		printArray(intArray); // pass an Integer array

		System.out.println("\nArray doubleArray contains:");
		printArray(doubleArray); // pass a Double array

		System.out.println("\nArray characterArray contains:");
		printArray(charArray); // pass a Character array

		System.out.printf("Max of %d, %d and %d is %d\n\n", 3, 4, 5,
				maximum(3, 4, 5));

		System.out.printf("Max of %.1f,%.1f and %.1f is %.1f\n\n", 6.6, 8.8,
				7.7, maximum(6.6, 8.8, 7.7));

		System.out.printf("Max of %s, %s and %s is %s\n", "pear", "apple",
				"orange", maximum("pear", "apple", "orange"));

	}

}
