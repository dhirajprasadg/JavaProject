package corejava.string.stringbuffer;

public class Sringbufandbuilder {

	public static void main(String[] args) {

		long Starttime1 = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer("Start ");
		for (int i = 0; i < 100000; i++) {
			sb.append(" Dhiraj Kumar");
		}
		System.out.println(" Time taken by String Buffer synchronized : "
				+ (System.currentTimeMillis() - Starttime1));
		long Starttime2 = System.currentTimeMillis();

		StringBuilder sbl = new StringBuilder("Start");
		for (int i = 0; i < 100000; i++) {
			sbl.append(" Dhiraj Kumar");
		}

		System.out.println(" Time taken by String Bulder non synchronized : "
				+ (System.currentTimeMillis() - Starttime2));

	}

}
