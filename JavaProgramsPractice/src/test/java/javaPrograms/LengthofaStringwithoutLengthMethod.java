package javaPrograms;

import org.testng.annotations.Test;

public class LengthofaStringwithoutLengthMethod {
@Test
public void stringLength(){
	String given ="AbhinaySundar";
	char[] array = given.toCharArray();
	int length =0;
	for(char c : array) {
		length++;
	}
		System.out.println(length);
	
}
}
