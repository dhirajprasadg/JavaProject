package corejava.javaio;

import java.io.FileOutputStream;

public class FileinputoutputstreamTest {

	public static void main(String[] args)  {
		try {
			FileOutputStream fout = new FileOutputStream(
					"E:/eclipse/workspace/Junk/filechildclassss.txt");

			String st = "Sachin was good player";
			byte by[] = st.getBytes();
			
			fout.write(by);
			fout.flush();
			fout.close();
			
			System.out.println("success...");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
