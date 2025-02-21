package testNG;

import org.testng.annotations.Test;

public class TestNG6 {
@Test
public void checkTime() {
	System.out.println("checkTime");
}
@Test
public void timeCheck() {
	System.out.println("timecheck");
}
@Test(timeOut = 200)
public void timeOut() throws InterruptedException {
	Thread.sleep(500);
	System.out.println("timeout");
}
}
