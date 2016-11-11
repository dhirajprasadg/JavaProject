package corejava.javareflection.reflectionapi;

import java.lang.reflect.Method;

public class MethodCall {

	public static void main(String[] args) throws Exception, Exception {
	
		Simple sm = new Simple();
		System.out.println( " Get Runtime Class Name from Object : sm.getClass() // : " + sm.getClass() );
	
		Class cl = sm.getClass();
        Method[] mt =cl.getDeclaredMethods();
        
           for (Method me: mt){
        	   System.out.println(" Method Name found : " + me);
           }
           
        // calling private method from another class 
        Class c = Class.forName("javareflection.Simple"); // Creating Class instance for Simple Class
        
        Method m = c.getDeclaredMethod("javareflection.Simple.pritName", null); 
        
        m.setAccessible(true);     
         
        Object o = c.newInstance(); 
        
        m.invoke(o, null);
           
        
	}

}
