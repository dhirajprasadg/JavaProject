package corejava.collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Hashtableex {

	public static void main(String[] args) {

		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(2, "Dhiraj");
		ht.put(2, "Dhiraj");
		ht.put(2, "Iti");
		ht.put(3, "Sweeta");
		ht.put(1, "Dhiraj");
		System.out.println(" HashTable : " + ht);
		System.out.println("---------------------------");

		Map<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(2, "Dhiraj");
		hm.put(2, "Dhiraj");
		hm.put(2, "Iti");
		hm.put(3, "Sweeta");
		hm.put(1, "Dhiraj");
		System.out.println(" HashMap : "+ hm);
		System.out.println("---------------------------");

		Map<Integer,String> tm = new TreeMap<Integer,String>();
		tm.put(2, "Dhiraj");
		tm.put(2, "Dhiraj");
		tm.put(2, "Iti");
		tm.put(3, "Sweeta");
		tm.put(1, "Dhiraj");
		System.out.println(" TreeMap : "+ tm);
		System.out.println("---------------------------");
	
		Set<String> hs = new HashSet<String>();
		hs.add("Dhiraj");
		hs.add("Arjun");
		hs.add( "Bhim");
		hs.add( "Iti");
		hs.add( "Sweeta");
		hs.add( "Dhiraj");
		System.out.println(" HashSet : "+ hs);
		System.out.println("---------------------------");
	
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("Dhiraj");
		ts.add("Arjun");
		ts.add("Bhim");
		ts.add("Iti");
		ts.add("Sweeta");
		ts.add("Dhiraj");
		System.out.println(" TreeSet : "+ ts);
		System.out.println("---------------------------");
		
		
		/*
		for(Entry hmen:hm.entrySet()){
			System.out.println("HM "+hmen);
		}
		
		for (Entry et : ht.entrySet()) {
			System.out.println(et.getKey() + " " + et.getValue());
		}
		
		System.out.println("--------------------------");
		Set<Entry<Integer, String>> se = ht.entrySet();

		Iterator it = se.iterator();
		while (it.hasNext()) {
			Entry ent = (Entry) it.next();
			System.out.println(ent.getKey() + " " + ent.getValue());

		}
*/
	}

}
