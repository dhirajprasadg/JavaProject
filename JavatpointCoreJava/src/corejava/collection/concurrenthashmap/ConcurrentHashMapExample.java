package corejava.collection.concurrenthashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
//http://www.journaldev.com/
public class ConcurrentHashMapExample {

	public static void main(String[] args) {
		Map<String, String> myMap = new ConcurrentHashMap<String, String>();
		myMap.put("1", "2");
		myMap.put("2", "2");
		myMap.put("3", "2");
		myMap.put("4", "2");
		myMap.put("5", "2");
		myMap.put("6", "2");

		System.out.println(" Concurrent Hash Map before Iteration : " + myMap);
		Iterator<String> it = myMap.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next();
			if (key.equals("3")) {
				myMap.put(key + "new ", " new3");
			}
		}

		System.out.println("Concurrent HashMap after iterator: " + myMap);

		Map<String, String> myMap0 = new HashMap<String, String>();
		myMap0.put("1", "2");
		myMap0.put("2", "2");
		myMap0.put("3", "2");
		myMap0.put("4", "2");
		myMap0.put("5", "2");
		myMap0.put("6", "2");

		System.out.println(" Hash Mpa bfore Iteration : " + myMap0);
		System.out.println(" Key Set " + myMap0.keySet());

		Iterator<String> it0 = myMap0.keySet().iterator();
		while (it0.hasNext()) {

			String key0 = it0.next();
			
			// HashMap contains a variable to count the number of modifications
			// and iterator use it when you call its next() function to get the
			// next entry.
			System.out.println(" Key Value : " + key0);

			if (key0.equals("3")) {
				//myMap0.put(key0+"new ", " new3");
				//break;
				myMap.put(key0, "new3");
			}

		}

		System.out.println(" HashMap after iterator: " + myMap0);

	}

}
