package corejavacontepttest;

public class Corejavaconcepttest {
    String name ;
    static String areaname;
    
	static {
		System.out.println(" Static block load before creating object");
	}

	public static void main(String[] args) {
     
		System.out.println(" main method runs");
		Corejavaconcepttest cj = new Corejavaconcepttest();
		cj.setName(" Mohan");
		cj.setareaName("Koramangala");
	//	System.out.println(" Name setup : " + name);
		cj.displayData();
		Corejavaconcepttest cj2 = new Corejavaconcepttest();
		cj2.setareaName(" Ananth Nagar ");
		cj2.displayData();
	}

	public void setName(String name){
		this.name = name;
		System.out.println(" Name setup : " + this.name);
	}
	
	public void setareaName(String areaname){
		this.areaname = areaname;
		System.out.println(" Area Name changed " + this.areaname);
	}
	
	public void displayData(){
		System.out.println(" Name : " + this.name + " // Area name : "  + this.areaname);
	}
}
   