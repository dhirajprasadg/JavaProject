package corejava.oops.finalkeyword;

public class Honda1 extends Honda2{

	void finalclassmethod() {
		System.out.println(" Method from Honda1 ");
	}
	/*
  Final method cant be overwriten 
	final void finalmethod(){
		System.out.println(" Final method cant be overwriten");
	}
	*/
	public static void main(String[] args) {

		ClassFinal fn = new ClassFinal(5);
		System.out.println(" Variable value from final " + fn.planet);
		
		fn.finalclassmethod();
		fn.planet = 1;
		System.out.println(" Variable value from final " + fn.planet);

		fn.planet = 2;
		System.out.println(" Variable value from final " + fn.planet);
		fn.finalclassmethod();
		
		Honda1 ho = new Honda1();
		ho.finalclassmethod();
		ho.finalmethod();
	}

}
