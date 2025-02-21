package ParametersinTestngSecond;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Fruits {
@Test
@Parameters("mango")
public void mango(@Optional("mango")String m) {
//public void mango(String m) {
	System.out.println("The fruits are");
	System.out.println(m);
	
}
@Test
@Parameters("pineapple")
public void pineapple(@Optional("apple")String n) {
//public void pineapple(String n) {
	System.out.println(n);
}

}
