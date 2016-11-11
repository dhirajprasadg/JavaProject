package corejava.javaserialiszation;

import java.io.Serializable;

public class Address implements Serializable {

	String addressline, city, pincode;

	public Address(String adl, String ci, String pc) {
		this.addressline = adl;
		this.city = ci;
		this.pincode = pc;
	}
}
