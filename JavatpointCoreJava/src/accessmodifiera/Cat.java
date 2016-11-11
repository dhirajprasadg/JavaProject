package accessmodifiera;

public class Cat extends Animal {

	protected void protectedmovefromcatclass() {
		System.out.println(" Protected method move from Cat class");
	}
	
	
	public void publicmethodfromcatclass(){
		System.out.println(" Public method from Cat  Class");
	}

	public static void main(String[] args) {

		Animal cta = new Cat();

		cta.protectedname = "Cat 1";
	    cta.finalmethodfromAnimal();

		System.out.println(" Protected variable of Animal " + cta.protectedname);

		cta.protectedmove();

		Cat ct = new Cat();

		ct.protectedmovefromcatclass();
		
		
		Dog dgg = new Dog();
		dgg.protectedmethodfromDog();
        
	}

}

