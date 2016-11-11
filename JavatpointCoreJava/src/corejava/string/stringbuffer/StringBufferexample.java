package corejava.string.stringbuffer;

public class StringBufferexample {
	

	public static void main(String[] args) {
		System.out.println(" This is String Buffer class : StringBuffer is mutable String and it is synchronised ");
		
		StringBuffer sf = new StringBuffer();
		sf.append(" Appended String ");
		StringBuffer sf1 = new StringBuffer(" Dhiraj ");
		sf1.append(" Kumar ");
		sf1.append(4.5);
		
		System.out.println(" String Buffer appended value \" : " + sf + " /// : " + sf1);
		sf1.replace(2, 8, "Javww");
		
		System.out.println(" String Buffer replace value : " + sf1);
		
		System.out.println(" StringBuffer Capacity : " + sf1.capacity());
	}

}
