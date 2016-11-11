package corejava.oops.staticbinding;

public class Dog extends Animal {

	private void eat() {
		System.out.println(" Dog is also Eating ");
	}

	
	public static void main(String[] args) {
		Animal an = new Dog();
	// an.eat() // cant call eat method of Dog as we use Animal as reference type and animal have private eat method
	Dog dg = new Dog();
	dg.eat();
	//When type of the object is determined at compiled time(by the compiler), it is known as static binding.
	//If there is any private, final or static method in a class, there is static binding.
	
	}
	
}
