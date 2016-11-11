package corejava.oops.overloading;


public class Calculation {
    
	void sum(int a ,int b){
    	System.out.println(" A + B Sum :" + a+b);
    }
	
	double sum(double a ,int b){
    	System.out.println(" A + B Sum :" + a+b);
		return a;
    }
	
    void sum(int a,int b,int c){
    	System.out.println(" A + B + C Sum :" + a+b+c);
		
	}
	
	double sum (double st, double st1){
		double total = st+st1;
		System.out.println(" Double Sum " + total);
		return total;		
	}
	
	public static void main(String[] args) {
		Calculation c = new Calculation();
		c.sum(2, 3);
		c.sum(2, 3, 5);
		c.sum(3.5, 4.4);
		c.sum(4.5, 4.5);

	
		
	}

}
