package accessmodifierb;

import accessmodifiera.Cat;

public class Rat {

	static {
		System.out
				.println(" Static block .. static keyword is the class property not object ");
	}

	private String ratName;

	private void privateratmethod() {
		System.out.println(" Private Rat method called from Rat class");
	}

	public static void main(String[] args) {
        Cat ctr = new Cat();
        ctr.publicmethodfromcatclass();
        
        
		Rat rt = new Rat();
		rt.privateratmethod();
		rt.ratName = "wow rat";
		System.out.println(" Rat Name : " +  rt.ratName);
	}

}
