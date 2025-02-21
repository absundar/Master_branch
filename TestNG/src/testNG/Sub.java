package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Sub {
@Test
@Parameters({"a","b"})
public void subtraction(int a, int b) {
	int c = a-b;
	System.out.println(c);
}
}
