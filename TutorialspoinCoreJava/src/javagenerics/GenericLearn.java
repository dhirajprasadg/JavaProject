package javagenerics;

public class GenericLearn {

	void printArray(Integer[] num) {

		System.out.println(" Integer Array Value " + num);
		for (Integer in : num) {
			System.out.println(" Intiger array Value : " + in);
		}
	}

	static <T> void printArrayGeneric(T[] anytypearray) {

		for (T ar : anytypearray) {
			System.out.println(" Array Value " + ar);
		}
	}

	public static void main(String[] args) {
		Integer[] numberArray = { 1, 3, 5, 7, 4 };
		GenericLearn gn = new GenericLearn();
		gn.printArray(numberArray);

		String[] stringArray = { "Mohan", " Sohan", "Tintu", "John" };

		Double[] doubleArray = { 1.4, 3.5, 5.2, 7.5, 4.2 };

		printArrayGeneric(numberArray);
		printArrayGeneric(stringArray);
		printArrayGeneric(doubleArray);
	}

}
