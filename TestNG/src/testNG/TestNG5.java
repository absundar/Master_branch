package testNG;

import org.testng.annotations.Test;

public class TestNG5 {
@Test(groups = {"fruit"})
public void pear() {
	System.out.println("Pear");
}
@Test
public void drumstick() {
	System.out.println("Drumstick");
}
@Test
public void carrot() {
	System.out.println("Carrot");
}
@Test(groups = {"fruit"})
public void grapes() {
System.out.println("Grapes");
}
}
