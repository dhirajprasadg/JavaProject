package corejava.collections.objectshoring;

import java.util.*;

public class ArrayListObjectCompare {

	
	public static void main(String[] args) {

		List<Film> films = new ArrayList<Film>();

		films.add(new Film().setRating(4.4).setName("Heena"));
		films.add(new Film().setRating(1).setName("Love"));
		films.add(new Film().setRating(3.4).setName("Bajigar"));
		films.add(new Film().setRating(3.4).setName("Ajuba"));
		films.add(new Film().setRating(4.8).setName("Premroj"));
		films.add(new Film().setRating(8.4).setName("Neelkamal"));
	
		System.out.println(" Before shorting : " + films);
  	
		String na = " soa";
	
		Collections.sort(films, new Comparator<Film>(){
		  @Override
			public int compare(Film obj1, Film obj2) {
			    if(obj1.getName().equals(obj2)){
			    	return Double.compare(obj1.getRating(), obj2.getRating());
			    }else{
			    	 return obj1.getName().compareToIgnoreCase(obj2.getName());
			    }
				
			}
	  });
		
		System.out.println(" After shorting : " + films);
	}

}
