package hashcodeandequalexample;

import java.util.HashSet;

public class TestEmpHash {

	public static void main(String[] args) {

		Empforhash emp1 = new Empforhash(23, "Sohan");

		Empforhash emp2 = new Empforhash(24, "Mohan");

		Empforhash emp3 = new Empforhash(25, "Chintu");

		Empforhash emp4 = new Empforhash(26, "tintu");

		Empforhash emp5 = new Empforhash(26, "tintu");

		HashSet<Empforhash> hs = new HashSet<Empforhash>();

		hs.add(emp1);
		hs.add(emp2);
		hs.add(emp3);
		hs.add(emp4);
		hs.add(emp5);

		System.out.println("HashSet Size--->>>" + hs.size());

		System.out.println("hs.contains( new Empforhash(25))--->>>"
				+ hs.contains(new Empforhash(25, "Chintu")));

		System.out.println("hs.remove( new Empforhash(24)--->>>"
				+ hs.remove(new Empforhash(24, "Mohan")));

		System.out.println("Now HashSet Size--->>>" + hs.size());
		
		System.out.println("emp 4 and 5 are equal -->>>" + emp4.equals(emp5));


	}
}
