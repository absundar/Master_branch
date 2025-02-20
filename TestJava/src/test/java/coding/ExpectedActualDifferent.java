package coding;

import static org.testng.Assert.assertEquals;

import org.junit.Test;

public class ExpectedActualDifferent {
@Test
	/*public void expectedAndActualDifferent() {
		int answer = 2+3;
		assertEquals(4, answer);*/
public static String SwitchOnInt(int number) {
	
	switch(number) {
	case 1:
		return "one";
	case 2:
		return "two";
	case 3:
		return "three";
	case 4:
		return "four";
	case 5:
		if(number >4) {
			return "too big";
		}
			case 6: 
				if(number<1) {
					return "too small";
				}
				}
	return null;
	
		
		
	}
}
