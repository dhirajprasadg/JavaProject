package corejava.oops.staticbinding;

import corejava.oops.staticbinding.*;

public class Honda extends Bike{
 
	Bike bk = new Bike();
	// bk.bikePrice(); cant access any method of bike inside the class because object of bike is not created

	{ // Static Block will be executed when we create object of Honda
		Bike bk1 = new Bike();
		bk1.bikeColordefault();
	}
	
	void bikeColordefault(){
		System.out.println(" Honda color is red ");
	}
	
	public static void main(String[] args) {
		
		Bike bk2 = new Bike();
		bk2.bikeColordefault();
		// Dynamic Binding .. Object creating is determind at runtime not compile time 
	    Bike bk3 = new Honda();	
	    bk3.bikeColordefault();
	    bk3.bikePricepublic(); // this method is called from Bike object as we know super class is also getting created 
	    
	}

}
