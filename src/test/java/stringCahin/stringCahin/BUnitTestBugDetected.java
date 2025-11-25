package stringCahin.stringCahin;
import org.junit.Test;
import static org.junit.Assert.*;

public class BUnitTestBugDetected {
	
	@Test
	public void testBWithStub() {
	CStubBugDetected steb = new CStubBugDetected();
	B b = new B(steb);
	
	 String result = b.process("H");
     assertEquals("HEX", result);
	}
}
