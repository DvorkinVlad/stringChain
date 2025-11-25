package stringCahin.stringCahin;

public class CStub extends C {              // לא מגלה את הבעיה 
	public CStub () {super(null);}
	
	 @Override
	    public String process(String prefix) {
	        return prefix;
	    }
	
	
}
