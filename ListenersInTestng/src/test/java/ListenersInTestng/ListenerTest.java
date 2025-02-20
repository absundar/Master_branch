package ListenersInTestng;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners
public class ListenerTest {
@Test
public void sum() {
	int sum;
	int a=3;
	int b= 4;
	sum = a+b;
	System.out.println(sum);
}
@Test
public void testOfFail() {
	System.out.println("TC has failed");
	Assert.assertTrue(false);
}
}
