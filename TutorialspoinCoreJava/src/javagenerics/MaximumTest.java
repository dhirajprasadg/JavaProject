package javagenerics;

import java.util.ArrayList;
import java.util.Collection;

public class MaximumTest {
	
	// determines the largest of three Comparable objects
	    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
	      T max = x;   // assume x is initially the largest
	      
	      if(y.compareTo(max) > 0) {
	         max = y;   // y is the largest so far
	      }
	      
	      if(z.compareTo(max) > 0) {
	         max = z;   // z is the largest now                 
	      }
	      return max;   // returns the largest object   
	   }
	    
	   public static void main(String args[]) {
	      System.out.println("Max of number 3 4 5 : " +  maximum( 3, 4, 5 ));

	      System.out.printf("Max of %.1f,%.1f and %.1f is %.1f\n\n",
	         6.6, 8.8, 7.7, maximum( 6.6, 8.8, 7.7 ));

	      System.out.printf("Max of %s, %s and %s is %s\n","pear",
	         "apple", "orange", maximum("pear", "apple", "orange"));

	      Employee e1 = new Employee( 3, "Bohan" );
	      Employee e2 = new Employee( 2, "Aohan" );
	      Employee e3 = new Employee( 1, "Cohan" );
	    
	     Collection <Employee> shot = new ArrayList<Employee>();
	     
	     shot.add(e1);
	     shot.add(e2);
	     shot.add(e3);

	     System.out.println( " Run time class:  " + shot.getClass() );
	     
	   //  System.out.println(" Compare the two Employee Object : " + maximum(e1, e2, e3));
	     
	   }
	   
	   
	}