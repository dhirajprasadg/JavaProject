package corejava.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

/*Interface Type	Implemented by
Set			HashSet, LinkedHashSet, EnumSet
SortedSet	TreeSet
List		Vector, Stack, ArrayList, LinkedList
Queue		PriorityQueue, LinkedList
Map			Hashtable, HashMap, LinkedHashMap, WeakHashMap, IdentityHashMap
SortedMap	TreeMap
*/

public class HashMapexample {

	public static void main(String[] args) {
		
		HashMap<Integer , String > hm = new HashMap<Integer,String>();
		hm.put(2, "Kumar");
		hm.put(2, "Dhiraj");
		hm.put(3, "Manoj");
        System.out.println(" HashMap size : " + hm.size());
		System.out.println("Get Value for key 2 :  hm.get(2): " + hm.get(2));
		Set<Entry<Integer, String>> st = hm.entrySet();
		System.out.println(" Set Value " + st);
   for (Entry<Integer,String> en : st ){
	   System.out.println( " Key  : " + en.getKey());
	   System.out.println( " Value : " + en.getValue());
   }
		
		
	  // Iterator cant be used to retrive key and value from HashMap 	
		Iterator it = st.iterator();
		while(it.hasNext()){
			
			System.out.println(" Entry are " + it.next());
	
			Entry<Integer,String> et = (Entry<Integer, String>) it.next();
			
			System.out.println(" Key are :" + et.getKey());
			
			System.out.println(" Value are: " + et.getValue());
			
			
		}
		
		
	}

}
