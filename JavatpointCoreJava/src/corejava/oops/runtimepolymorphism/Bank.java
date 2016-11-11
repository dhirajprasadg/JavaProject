package corejava.oops.runtimepolymorphism;

public abstract class Bank {
     int taxpay =14; 
	 abstract int getRateofInterest();
	 
	 final String giveLone(){
		 return "onlyEmployee";
	 }

}
