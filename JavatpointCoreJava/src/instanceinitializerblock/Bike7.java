package instanceinitializerblock;

public class Bike7 {
       static int staticspeed ;
	   int speed;
	   int speedconstructor;
        Bike7(){
        	System.out.println(" bike speed from contructor: " + speedconstructor);
        }
        
        {
        	speedconstructor =111;	
        	System.out.println(" Instance initiazing block run each time when object is created");
        }
	public static void main(String[] args) {
		System.out.println( " Bike StaticSpeed " + staticspeed);
         // cant call not static or instance valriable from static method System.out.println(" Bike Speed" + speed);
		Bike7 bk = new Bike7();
		Bike7 bk1 = new Bike7();
		bk.speed = 88;
		System.out.println(" Bike Speed variable directly called : " + bk.speed);
		bk.speeding();
		System.out.println(" Bike speed value from staticspeed variable " + bk.staticspeed);
		
	}
	
	public void speeding(){
		System.out.println( " Bike speed : " + speed);
	}

}
