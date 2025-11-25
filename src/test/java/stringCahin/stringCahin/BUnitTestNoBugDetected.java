package stringCahin.stringCahin;
import org.junit.Test;
import static org.junit.Assert.*;

public class BUnitTestNoBugDetected {	// לא מגלה את הבעיה
	 @Test
	    public void testBWithStub() {
	        CStub stub = new CStub();
	        B b = new B(stub);
	        String result = b.process("H");
	        assertEquals("HE", result);
	    }

}