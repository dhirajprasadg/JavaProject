package accessmodifierb;

import accessmodifiera.Animal;

public class Elephant extends Animal{
	
	final String Elephantname = " ElephantTargen";
    final void finalmethodfromElephant(){
    	System.out.println(" Final Method of Elephant " + Elephantname);
    }
	public static void main(String[] args) {
	
		Animal ele = new Elephant();
		ele.publicmethodofAnimal();
		
		Elephant eta = new Elephant();
		
		System.out.println(" Elephant Name : " + eta.Elephantname);  
		
		eta.finalmethodfromElephant();
	}

}
