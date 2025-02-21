package ParametersTestng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Multiply {
@Test
@Parameters({"a","b"})
public void mul(int c, int d) {
	int mul = c*d;
	System.out.println("The multiplication is :"+ mul);
}
}
