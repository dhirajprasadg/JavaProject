package accessmodifiera;

public class Animal {

	protected String protectedname;
    
	
	protected void protectedmove() {
		System.out.println(" protected method move from Animal class");
	}

	public void publicmethodofAnimal(){
		System.out.println(" Public Method of Animal ");
	}
	
	final void finalmethodfromAnimal(){
		System.out.println(" Want to check final method can be modified in subclass or not");
	}
}
