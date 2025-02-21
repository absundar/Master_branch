package testNG;

import org.testng.annotations.Test;

public class TestNG1 {
@Test(groups = {"Include Group"})
public void test() {
	System.out.println("testng validation");
}
@Test
public void test100() {
	System.out.println("test100");
}
	}


