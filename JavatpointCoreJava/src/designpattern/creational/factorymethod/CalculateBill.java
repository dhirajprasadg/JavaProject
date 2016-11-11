package designpattern.creational.factorymethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class CalculateBill {

	public static void main(String[] args) throws IOException {
		
		System.out.println(" Please enter the plan name ");
		
		InputStreamReader isr = new InputStreamReader(System.in);

		BufferedReader br = new BufferedReader(isr);

		String planName = br.readLine();
		
		System.out.print("Enter the number of units for bill will be calculated: ");

		int units = Integer.parseInt(br.readLine());

		GetPlanFactory gpf = new GetPlanFactory(); // PlanFactory object created and getPlan called 

		Plan pl = gpf.getPlan(planName);

		pl.getRate();

		pl.calculateBill(units);

	}

}
