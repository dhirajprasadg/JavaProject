package corejava.oops.superkeyword;

public class Bike1 extends Vehicle {

	Bike1() {
		// super(); when we instanciate the child class which is extending
		// parent class then super method is automatically called by compiler
		// and so parent class constructor is invoked by default
		System.out.println(" Bike 1 ie child class consturctor invoked ");
		
	}

	int speed1 = 200;
	int speed2 = 400;


	void display() {

		System.out.println(" Bike Seepd : " + speed);
		System.out.println(" Bike Seepd1 : " + speed1);
		System.out.println(" Bike Seepd1 from super: " + super.speed1);
	}
 // super can be used to invoke parent class method 
	void invokeparent(){
		System.out.println(" --------  // super can be used to invoke parent class method ------------");
		super.display();
		super.displayed();
	}
	
	public static void main(String[] args) {

		Bike1 b = new Bike1();
		// If we have display method in super class and also in child class then
		// object of child class will refer child class method
		b.display();
		b.displayed(); // displayed mehtod is not is not there in child class so
						// it will be taken from super class

		b.invokeparent();
		System.out.println(" directly calling the super class variable b.speed : " + b.speed);
	}

}
