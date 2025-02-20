package testNG;

import org.testng.annotations.Test;

public class TestNG4 {
@Test
public void Ragav() {
	System.out.println("Ragav");
}
@Test(dependsOnMethods = {"Ragav"})
public void Abhi() {
	System.out.println("abhi");
}
@Test
public void Leela() {
	System.out.println("Leela");
}
}
