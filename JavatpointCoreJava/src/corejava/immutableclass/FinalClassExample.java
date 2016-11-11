package corejava.immutableclass;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
//http://www.journaldev.com/129/how-to-create-immutable-class-in-java
public final class FinalClassExample {

	private final int id;
	private final String name;
	private final HashMap<String, String> testmap;

	/*
	 * FinalClassExample(int id, String name, HashMap<String, String> hm) {
	 * System.out.println("Performing Shallow Copy for Object initialization");
	 * this.id = id; this.name = name; this.testmap = hm; }
	 */

	FinalClassExample(int id, String name, HashMap<String, String> hm) {
		System.out.println("Performing Deep Copy for Object initialization");
		this.id = id;
		this.name = name;
		HashMap<String, String> tempmap = new HashMap<String, String>();
/*		Iterator<String> it = hm.keySet().iterator();
		
		while (it.hasNext()) {
			String keys = it.next();
			tempmap.put(keys, hm.get(keys));

		}
		this.testmap = tempmap;
*/
		Iterator<Map.Entry<String,String>> en = hm.entrySet().iterator();
        while(en.hasNext()){
        	Entry<String,String> ent =en.next();
        	String key1 = ent.getKey();
        	String valu1 = ent.getValue();
        	tempmap.put(key1, valu1);
        }
        System.out.println(tempmap);
        this.testmap = tempmap;
		
	}

	public int getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	// Accessor function for mutable objects

	public HashMap<String, String> getTestmap() {
		return (HashMap<String, String>) testmap.clone();
	}

	public static void main(String[] args) {

		HashMap<String, String> h1 = new HashMap<String, String>();
		h1.put("1 ", "First");
		h1.put("2 ", "Second");
		int i = 10;
		String s = "Original";

		FinalClassExample fc = new FinalClassExample(i, s, h1);
		//Lets see whether its copy by field or reference
		System.out.println(" compareing the string reference :  "
				+ (s == fc.getName()));

		System.out.println(" Comparing two map reference : "
				+ (h1 == fc.getTestmap()));

		System.out.println("fc id:"+fc.getId());
		System.out.println("fc name:"+fc.getName());
		System.out.println("fc testMap:"+fc.getTestmap());
		
		//change the local variable values
		
		
	}

}
