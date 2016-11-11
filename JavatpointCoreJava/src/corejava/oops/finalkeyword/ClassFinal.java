package corejava.oops.finalkeyword;

public final class ClassFinal {
	int planet;
	final private int chanelno;

	ClassFinal(int ch){
		System.out.println( " Final Class construcor invoked ");
		this.chanelno =ch;
	}
	void finalclassmethod() {
		System.out.println(" It is final Class Method .. lets check it can be overwriten or not ");
		System.out.println(" Chanel no : " + this.chanelno);
		
	}

	final void finalmethodoffinalclass (int it,int cha){
		this.planet=it;
	//	this.chanelno=cha; final variable cant be changed from any method except constructor
	}
	
}
