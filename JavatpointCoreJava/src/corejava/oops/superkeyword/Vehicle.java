package corejava.oops.superkeyword;

public class Vehicle {

	Vehicle() {
        System.out.println(" Parent Class Consturctor invoked ");
	}

	int speed = 150;
	int speed1 = 300;
	public int noofgear = 5;

	void display() {

		System.out.println(" Maximum Vehical Speed : " + speed);

		System.out.println(" Maximum number of Gear in Vehicle : " + noofgear);

	}

	void displayed() {

		System.out.println(" Maximum Vehical Speed : " + speed);

		System.out.println(" Maximum number of Gear in Vehicle : " + noofgear);

	}

}
