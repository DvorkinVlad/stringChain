package stringCahin.stringCahin;
import org.junit.Test;
import static org.junit.Assert.*;


public class CStubBugDetected extends C {
	
	public CStubBugDetected(){super(null);}
	
	public String process(String prefix) {
		return prefix+"X";
	}

}
