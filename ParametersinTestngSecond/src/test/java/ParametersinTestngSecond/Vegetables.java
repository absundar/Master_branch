package ParametersinTestngSecond;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Vegetables {
@Test
@Parameters("Carrot")
//public void carrot(String m) {
public void carrot(@Optional ("carrot") String m) {
	System.out.println("The vegetables are");
	System.out.println(m);
}
@Test
@Parameters("Cauliflower")
//public void cauliflower(String n) {
public void cauliflower(@Optional ("cauliflower") String n) {
	System.out.println(n);
}
}
