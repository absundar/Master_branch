package coding;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class AddTwoPlusTwoTest {
	@Test
//	public void additon() {
//int answer = 2+2;
//assertEquals("2+2=4", 4, answer);
//System.out.println(answer);
//}
	public static String SwitchValidation(String shortCode) {
		if(shortCode == null) {
		return "Rest of the world";
	}
	switch(shortCode.toUpperCase()) {
	case "UK":
		return "United Kingdom";
		//break;
	case "US":
		return "United States";
		//break;
	case "USA":
		return "United States";
		//break;
	case "FR":
		return "France";
		//break;
	case "SE":
		return "Sweden";
		//break;	
		default:
			return "Rest of the world";
	}
	}
	public static void main(String[] args) {
		System.out.println("UK");
	}
}

