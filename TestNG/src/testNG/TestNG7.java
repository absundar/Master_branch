package testNG;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners
public class TestNG7 {
@Test
public void sum() {
	int sum = 0;
	int a =5;
	int b= 8;
	sum = a+b;
	System.out.println(sum);
}
@Test
public void testOfFail() {
	System.out.println("tcs have been failed");
	Assert.assertTrue(false);
}
}
