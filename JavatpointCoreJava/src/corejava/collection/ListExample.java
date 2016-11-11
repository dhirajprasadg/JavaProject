package corejava.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ListExample {

	public static void main(String[] args) {
		
	// Array Example  , array can contain premitive type 	 
		int[] in = new int[5];
		in[0] = 1;
		in[0] = 2;
		in[1] = 5;
		System.out.println(in.length);
		System.out.println(" Array Value : " + in[0] + " : " + in[1] + " : " + in[2] + " : " + in[3] + " : " + in[4] );
		
		// collection cant hold premitive as type 
		// List <int> ltrp = new ArrayList() ;	Primitive type is not allowed in collection
		 List<String> lt = new ArrayList();
		 List <Integer> ltr = new ArrayList() ;
		
		
		lt.add("Mohan");
		lt.add("Sohan");
		lt.add("Sohan");
		lt.add("Sohan");
		System.out.println(lt);
		
		System.out.println(" Index of : " + lt.indexOf("Sohan") );
		System.out.println("---- ArrayList can have duplicate Element -----");
		
		for(int i=0; i<lt.size();i++){
			
			System.out.println(" ArrayList Value " + lt.get(i));
			
		}
		
		Iterator itlist = lt.iterator();
		while(itlist.hasNext()){
			System.out.println(" Values of List through Iterator : " + itlist.next());
		}
		
		System.out.println(" ------- Convert ArrayList to HashSet-------------");
		
		Set st = new HashSet(lt);
		
		System.out.println("Hash Set Value " + st);
		
		Iterator itr = st.iterator();
		while(itr.hasNext()){
			System.out.println( " Hash Set value through iterator : " + itr.next());
		}
		
	}

}
