package corejavacontepttest;

public abstract class AbstractClassexample {

	public void animalrun() {
		System.out.println(" All Legged animals runs");
	}

	public abstract void eat(String name);
	
	static void runi() {
		System.out.println(" static method ");
	}
	
	final void finalmethodofabstract(String test) {
		System.out.println(" final method of abstract class");
	}
}
