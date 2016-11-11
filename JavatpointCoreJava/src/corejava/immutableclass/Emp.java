package corejava.immutableclass;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public final class Emp implements Comparator{

	public int number;
	public String name;

	public void getEmpsalary() {
		System.out.println(" Employee Salary ");
	}

	public static void main(String[] args) {

		Map<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Dhiraj");
		hm.put(1, "Dhiraj");
		hm.put(1, "Iti");

		Iterator<Entry<Integer, String>> ent = hm.entrySet().iterator();

		while (ent.hasNext()) {
			Entry<Integer, String> entry = ent.next();
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());

		}

/*		Emp emp1 = new Emp();
		emp1.number = 1;
		emp1.name = "Dhiraj";
		System.out.println(" Emp Number " + emp1.number + " Emp Name : "
				+ emp1.name);
		
		Emp emp2 = new Emp();
		emp2.number = 1;
		emp2.name = "Dhiraj";

		Emp emp3 = new Emp();
		emp3.number = 1;
		emp3.name = "Dhiraj";

		Map<Integer, Emp> hme = new HashMap<Integer, Emp>();
		hme.put(1, emp1);
		hme.put(2, emp2);
		hme.put(1, emp2);

		Iterator<Entry<Integer, Emp>> ent1 = hme.entrySet().iterator();

		while (ent1.hasNext()) {
			Entry<Integer, Emp> entry1 = ent1.next();
			System.out.println("----------------------------");
			System.out.println(" Key : " + entry1.getKey());
			System.out.println(" Emp No: " + entry1.getValue().number
					+ " Emp Name:  " + entry1.getValue().name);
			System.out.println();

		}

*/
		Emp emp1 = new Emp();
		emp1.number = 2;
		emp1.name = "Dhiraj";
		
		Emp emp2 = new Emp();
		emp2.number = 3;
		emp2.name = "Ahiraj";

		Emp emp3 = new Emp();
		emp3.number = 1;
		emp3.name = "Chiraj";

		Map< Emp, Integer> hme = new HashMap< Emp,Integer>();
		hme.put( emp1 ,1);
		hme.put( emp2,2);
		hme.put( emp3,3);

		Iterator<Entry< Emp ,Integer>> ent1 = hme.entrySet().iterator();

		while (ent1.hasNext()) {
			Entry< Emp,Integer> entry1 = ent1.next();
			System.out.println("----------------------------");
			System.out.println(" Key | Emp Name : " + entry1.getKey().name + " | Emp number :" + entry1.getKey().number);
			System.out.println(" Value : " +  entry1.getValue());

		}

		
	}
/*
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + number;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Emp))
			return false;
		Emp other = (Emp) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (number != other.number)
			return false;
		return true;
	}

*/	/*
	 * @Override public int hashCode() { final int prime = 31; int result = 1;
	 * result = prime * result + ((name == null) ? 0 : name.hashCode()); result
	 * = prime * result + number; return result; }
	 * 
	 * @Override public boolean equals(Object obj) { if (this == obj) return
	 * true; if (obj == null) return false; if (getClass() != obj.getClass())
	 * return false; Emp other = (Emp) obj; if (name == null) { if (other.name
	 * != null) return false; } else if (!name.equals(other.name)) return false;
	 * if (number != other.number) return false; return true; }
	 */

	@Override
	public int compare(Object arg0, Object arg1) {
	
		return 0;
	}


}
