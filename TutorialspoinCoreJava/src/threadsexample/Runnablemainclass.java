package threadsexample;

public class Runnablemainclass {

	public static void main(String[] args) {

	Thread t1 = new Thread();
	t1.setName(" Mohan " );
	t1.start();
	try {
		t1.wait(500);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println(" Thread Name " + t1.getName());
	
	
	}

}
