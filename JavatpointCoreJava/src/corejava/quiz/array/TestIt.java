package corejava.quiz.array;

class ChangeIt {

	static void doIt(int[] z) {
		int temp = z[z.length - 1];
		// z[0] = temp; // working
		// z = null; // not working because
		// primitive(char,int,double,float,byte,short,long can't have null
		// -----------------------------
		// int[] y = { 2, 5, 8, 8,9 }; // it is not working
		// z = y;
		// -----------------------------
		int temp1 = 10;
		z[1] = temp1;// it is working
		z[2] = 15; // working
		int[] A = z;
		System.out.println(A[1]);
	}

	static void blur(char[] z, String st) {
		if (z.length < st.length()) {
			System.out
					.println(" Array size is not enough to hold all character in string ");
			return;
		} else {
			for (int j = 0; j < st.length(); j++) {
				z[j] = st.charAt(j);
			}
		}

	}
}

public class TestIt {
	static int[] a = { 1, 2, 3, 4, 5, 6 };

	public static void main(String[] args) {

		System.out.println(" Array Length : " + a.length);
		System.out.println(" Last Value of Array : " + a[a.length - 1]);

		int[] myArray = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < myArray.length; i++) {
			System.out.print(" " + myArray[i]);
		}
		System.out.println(" \n Changed Array Value are as below \n");
		ChangeIt.doIt(myArray);
		for (int i = 0; i < myArray.length; i++) {
			System.out.print(" " + myArray[i]);
		}
		System.out.println("\n");
		String st1 = "My Name is dhiraj";
		char[] ch1 = new char[st1.length()];
		ChangeIt.blur(ch1, st1);
		System.out.println("Character filled from string to ch1 array : \n");
		for (int i = 0; i < ch1.length; i++) {
			System.out.print(" , " + ch1[i]);
		}

	}

}
