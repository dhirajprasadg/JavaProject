package dateandtime;

import java.util.*;

public class DateandTime {
	
	public static void main (String[] args){
		
		Date dt = new Date();
		long currenttime = dt.getTime();
		
		System.out.println(" Print Current time : " + dt.getYear());
		
		long aftertime = dt.getTime();
		long Diff = currenttime - aftertime;
		
		System.out.println("time diff : " + Diff);
	}

}
