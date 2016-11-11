package corejava.oops.runtimepolymorphism;

public class CalculateInterest {

	public static void main(String[] args) {

		Bank sbi = new SBI();
		Bank ici = new ICICI();
		Bank hdf = new HDFC();

		System.out.println(" SBI Rate of Interest " + sbi.getRateofInterest());
		System.out.println(" ICICI Rate of Interest " + ici.getRateofInterest());
		System.out.println(" HDFC Rate of Interest " + hdf.getRateofInterest());

		// Data Member can't be overriden so runtime ploymorphism cant be achived with it 
		System.out.println(" Tax need to be baid with SBI : " + sbi.taxpay);
		System.out.println(" Tax need to be baid with ICICI : " + ici.taxpay);
		System.out.println(" Tax need to be baid with HDFC : " + hdf.taxpay);
	 // However we can change the value of datamember at runtime by using method see factory pattern example
		
		// If we want to access the data of subclass,in that case we need to create object of subclass
		SBI sb = new SBI();
		System.out.println( " Tax need to pais for SBI : " +  sb.taxpay);
		
	
		
	}

}
