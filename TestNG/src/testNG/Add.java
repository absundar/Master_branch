package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Add {
@Test
@Parameters({"a","b"})
public void addition(int a, int b) {
	int c = a +b;
	System.out.println(c);
}
}
