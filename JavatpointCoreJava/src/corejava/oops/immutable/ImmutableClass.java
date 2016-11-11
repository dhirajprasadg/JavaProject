package corejava.oops.immutable;

public final class ImmutableClass {
	final String PANCARD;

	ImmutableClass(String pcard) {
		this.PANCARD = pcard;
	}
    public String getpanno(){
    	return this.PANCARD;
    }
	
	public static void main(String[] args) {
		ImmutableClass im = new ImmutableClass("BDRPK");
		System.out.println(" PAN No :  " + im.getpanno());
		
		String st = "My name is dhiraj";
		String[] str = st.split("\\s");
		for(int i=0 ;i< str.length ;i++){
			System.out.println(" Token method of String // " + str[i] );
					
		}
		
	}

}
