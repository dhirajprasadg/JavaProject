package corejavacontepttest;

public class ClassDog extends AbstractClassexample{

	@Override
	public void eat(String name) {
		System.out.println(" Dog eats " + name);
		
	}
	

	public void animalrun() {
		System.out.println(" All Legged animal runs including Dog ");
	}
	
	public void dogspecificmethod(){
		System.out.println("  this method is for dog only");
	}
	
	

}
