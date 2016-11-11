package corejava.collections.objectshoring;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Hashmapvalueshorting {

	public static void main(String[] args) {
	
		HashMap<String, String> countrycapital = new HashMap<String, String>();
		countrycapital.put("India", "Delhi");
		countrycapital.put("Japan", "Tokyo");
		countrycapital.put("France", "Paris");
		countrycapital.put("Russia", "Moscow");
		// put the Hashmap object into ArrayList
		List<Entry<String,String>> entrylist = new ArrayList<Entry<String,String>>(countrycapital.entrySet());
		// use collections short method to short the array list  and use comparator 
		Collections.sort(entrylist, new Comparator<Entry<String,String>>(){

			@Override
			public int compare(Entry<String,String> o1, Entry<String,String> o2) {
				
				return o1.getValue().compareToIgnoreCase(o2.getValue());
			}
			
		});
		// Now you have shorted entrylist based on value
		// put this entry into Linkedhashmap
		LinkedHashMap<String,String> lhm = new LinkedHashMap<String,String>();
		
		for(Entry<String,String> lhmshorted: entrylist){
			lhm.put(lhmshorted.getKey(), lhmshorted.getValue());
		}
		
		// print the value of LinkedHashMap -- shorted Value
		
		for(String st:lhm.keySet()){
		 System.out.println(" Key : " + st +" - Value " + lhm.get(st));
		}
	}

}
