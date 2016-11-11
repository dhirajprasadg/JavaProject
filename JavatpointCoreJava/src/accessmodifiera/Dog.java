package accessmodifiera;

public class Dog {
	private String privatedogname = "Doggg";
	private void privatemethodmovefromDog(){
		System.out.println(" Private Method move from Dog ");
	}
	protected void protectedmethodfromDog(){
		System.out.println(" Protected Method from Dog ");
	}
	
	public static void main(String[] args) {
	
		Cat ctd = new Cat();

		ctd.protectedmove();
		
		ctd.protectedmovefromcatclass();
		
		Dog dg = new Dog();
		dg.privatemethodmovefromDog();
		System.out.println(" Priave Variable privatedogname " + dg.privatedogname );
		dg.privatedogname="Dogggg";
		System.out.println(" Priave Variable privatedogname " + dg.privatedogname );
		
		
	}

}
