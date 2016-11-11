package corejava.javareflection.reflectionapi;
import java.lang.Class;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

// Java Reflection is a process of examining or modifying the run time behavior of a class at run time.
class Reflectionuse {
	  
	
	public static void main(String args[]) throws Exception {
	   /* How to get the object of Class class?
	      3 ways to get the instance of Class class.
	  			1) forName() method of Class class
				2) getClass() method of Object class
				3) the .class syntax  */
		System.out.println("----1st Method to create object of Class class ----"); 
		Class c = Class.forName("corejava.javareflection.reflectionapi.Simple");  // returns the instance of Class class.
		System.out.println("c.getName() - getName() method called from 1st instance of class : " + c.getName());
		System.out.println(" We can call other methods in object of class ex c.getSuperclass().getName() \n : " + c.getSuperclass().getName());
		
		System.out.println("----2nd Method to create object of Class class ----"); 
		Simple smple = new Simple();
		Class clas = smple.getClass(); // retrun the Classs instance from object using getClass method of object
		System.out.println("  get Class " +  clas.getName());
	
		System.out.println("----3rd Method to create object of Class class ----"); 
		Class clb = boolean.class; // getting boolean class details
		Class clss = Simple.class;
		System.out.println(" 3rd method to get Class " + clb.getName() + " // " + clss.getName() );
		
			
		System.out.println(" --------- Other Method of Class -------------- ");
		// Class cl = Class.forName("java.lang.Class");
		Class cl = Class.forName("java.util.ArrayList");
		System.out.println(" cl.getname - Class Name : " + cl.getName());
		System.out.println(" cl.getCanonicalName() :  " + cl.getCanonicalName());
		System.out.println(" cl.isInterface() :  " + cl.isInterface());
		System.out.println(" cl.isArray() :  " + cl.isArray());
		
		System.out.println("---- newInstance() method of Class class and Constructor class is used \n to "
				+ "create a new instance of the class.--- ");
		
		Class clnew = Simple.class;
		Simple objnew = (Simple)clnew.newInstance();
		objnew.printName();
		
		
		
		System.out.println("-------------Get Complete method list of Any Class---------------");
		Method[] mt = cl.getMethods();
	     for (Method me : mt){
	    	 System.out.println( " Method Name : " + me.getName());
	     }
	     
	     System.out.println(" ---------- List of Field in Class ---------------");
         Field[] fld = cl.getDeclaredFields();
	     for (Field fl : fld){
	    	 System.out.println(" Get list of Field : " + fl.getName());
	     }
		// verifying the overriden method 
	     Simple smp = new Simple();
	     smp.printName();
	     
	}

}
