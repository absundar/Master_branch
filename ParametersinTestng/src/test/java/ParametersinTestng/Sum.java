package ParametersinTestng;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Sum {
@Test
@Parameters({"a","b"})
//public void add(@Optional("5") int c, @Optional("4") int d) {
	public void add(int c, int d) {
	int sum = c+d;
	System.out.println("Addition :"+ sum);
}
}
