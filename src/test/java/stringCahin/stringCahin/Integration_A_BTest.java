package stringCahin.stringCahin;
import org.junit.Test;
import static org.junit.Assert.*;

public class Integration_A_BTest {
	
	@Test
	public void TestIntegration_A_B()
	{
		CStubBugDetected stub = new CStubBugDetected();
		B b = new B(stub);
		A a = new A(b);
		
		String result = a.process("");
		assertEquals("HEX", result);
		
	}	

}
