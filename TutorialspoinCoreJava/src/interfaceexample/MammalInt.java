package interfaceexample;

public class MammalInt implements Animal {

	@Override
	public void eat() {
		System.out.println("Mammal Eats");

	}

	@Override
	public void travel() {
		System.out.println("Mammal Travels");

	}

	public int noOfLegs() {
		return 0;
	}

	public static void main(String[] args) {

		MammalInt mit = new MammalInt();
		mit.eat();
		mit.travel();
	}

}
