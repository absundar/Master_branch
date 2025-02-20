package javaPrograms;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

public class GenerateRandomNumbers {
@Test
public void randomNumber(){
	//Method 1
	Random random = new Random();
	System.out.println(random.nextInt());
	System.out.println(random.nextDouble());
}
@Test
public void mathMethod() {
	System.out.println(Math.random());
}
@Test
public void apacheCommonsLangAPIMethod() {
String randomNumber = RandomStringUtils.randomNumeric(10);
System.out.println(randomNumber);

}
}
