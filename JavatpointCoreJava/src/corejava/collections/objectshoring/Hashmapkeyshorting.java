package corejava.collections.objectshoring;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

// http://www.java2blog.com/2016/05/how-to-sort-hashmap-in-java-by-keys-and.html
public class Hashmapkeyshorting {

	public static void main(String[] args) {

		Country India = new Country("India", 700);
		Country Japan = new Country("Japan", 600);
		Country France = new Country("France", 500);
		Country Russia = new Country("Russia", 400);

		HashMap<Country, String> countrycapital = new HashMap<Country, String>();
		countrycapital.put(India, "Delhi");
		countrycapital.put(Japan, "Tokyo");
		countrycapital.put(France, "Paris");
		countrycapital.put(Russia, "Moscow");
	
		System.out.println(" ----------- Without Shoring the Key object variable-----------");
		for (Country en : countrycapital.keySet()) {

			System.out.println(" Key : " + en.getName() + " - Value : "
					+ countrycapital.get(en));

		}
		System.out.println(" ----------- After Shoring the Key object variable-----------");
		
		TreeMap<Country,String> treemapshort = new TreeMap<Country,String>(countrycapital);
		
		for(Country shortedhashmap: treemapshort.keySet()){
			System.out.println(" Key : " + shortedhashmap.getName() + " - Value : " + treemapshort.get(shortedhashmap) );
		}
		
	}

}
