package corejava.oops.superkeyword;

public class SuperExample extends Vehicle{

	int speed = 100;
	int noofgearbike1 = super.noofgear;
	
	void displaybike1 (){
		
		System.out.println(" Bike 1 Max Speed : " + speed);
		
		System.out.println( " Bike 1 Max Gear : " + super.noofgear + " : " + noofgearbike1);
	}
	//@Override below method is not overriden since it have String argument , in overriding you cant 
	// change the return type 
	void displayed(String name){
		String na = name;
	}
	public static void main(String[] args) {
		
		
		SuperExample se = new SuperExample();

		se.display();

		se.displaybike1();
	}

}
