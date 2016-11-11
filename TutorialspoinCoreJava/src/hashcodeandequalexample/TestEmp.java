package hashcodeandequalexample;

public class TestEmp {
	public static void main(String[] args) {
		
		Emp emp1 = new Emp(23);
		
		System.out.println("emp1.hashCode()--->>>" + emp1.hashCode());
		
		int originalHashCode = System.identityHashCode(emp1);
		
		System.out.println("Original hashCode of Emp---->>>"+originalHashCode);
		
		Emp emp2 = new Emp(25);
		Emp emp3 = new Emp(25);
		
		System.out.println( " Emp 2 and Emp 3 are equal : " + emp2.equals(emp3));
		
	}
}