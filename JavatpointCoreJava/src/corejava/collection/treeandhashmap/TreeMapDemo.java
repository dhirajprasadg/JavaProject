package corejava.collection.treeandhashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {

		Map<String, Double> mt = new TreeMap<String, Double>();
		mt.put("Rohan", 33.3);
		mt.put("Mohan", 33.8);
		mt.put("Rohan", 33.3);
		mt.put("Cintu", 33.9);
		// get the Set of entries
		Set st = mt.entrySet();
		Set stk = mt.keySet();

		System.out.println(" Entry Set from TreeMap : " + st);
		System.out.println(" Key Set from TreeMap : " + stk);

		Iterator it = st.iterator();
		while (it.hasNext()) {
			Entry e = (Entry) it.next();
			System.out.println(" Entry Value \\ " + e);
			System.out.println("  Hashcode of Key \\ " + e.hashCode());
			System.out.println("  Hashcode of Value \\ " + e.hashCode());
			System.out.println(" Key " + e.getKey());
			System.out.println(" Value " + e.getValue());
		}

		System.out.println("-------- HashMap Example ---------------");

		Map hm = new HashMap<String, Integer>();
		hm.put("Rohan", 33.3);
		hm.put("Mohan", 33.8);
		hm.put("Rohan", 33.3);
		hm.put("Cintu", 33.9);

		System.out.println(" HashMap Value : " + hm);
		
		Set set =hm.entrySet();
		Iterator itr = set.iterator();
		while(itr.hasNext()){
			Map.Entry ent = (Entry) itr.next();
			System.out.println(" Key : " +  ent.getKey());

			System.out.println(" Value : " +  ent.getValue());
		}
		
	}

}
