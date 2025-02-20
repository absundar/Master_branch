package testNG;

import org.testng.annotations.Test;

public class TestNG2 {
@Test(groups = "smokeTest")
	public void Test1() {
		System.out.println("test1");
	}
@Test
	public void Test2() {
		System.out.println("Test2");
	}
}
