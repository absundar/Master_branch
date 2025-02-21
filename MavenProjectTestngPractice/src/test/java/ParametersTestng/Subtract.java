package ParametersTestng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Subtract {
@Test
@Parameters({"a","b"})
public void minus(int c, int d) {
	int sub= c-d;
	System.out.println("The subtraction is: "+ sub);
}
}
