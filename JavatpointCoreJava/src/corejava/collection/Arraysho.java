package corejava.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Arraysho {

	public static void main(String[] args) {

		int[] in = { 4, 4, 5, 3, 8, 4, 1 };
		System.out.println(" in Array Value : " + in);
		
		for (int valu : in) {
			System.out.println(" Array Value before : " + valu);
		}
		in.hashCode();
		Arrays.sort(in);

		for (int valu : in) {
			System.out.println(" Array Value After -- : " + valu);
		}
		List<String> lis = new ArrayList<String>();
		
		Collections.sort(lis, new Comparator<Object>(){

			@Override
			public int compare(Object paramT1, Object paramT2) {
                
				return 0;
			}
			
		});
	}

}
