package coding;

import static org.testng.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import DB.TestJava.TestAppEnv;

public class TestAppEnvironmentTest {
	@Test
	public void TestExample() {
	ChromeDriver driver = new ChromeDriver();
	driver.get(TestAppEnv.getUrl());
	//assertEquals("Test App", driver.getTitle());
	assertEquals(67, TestAppEnv.PORT);
	assertEquals("192.123.0.3", TestAppEnv.DOMAIN);
}
}
