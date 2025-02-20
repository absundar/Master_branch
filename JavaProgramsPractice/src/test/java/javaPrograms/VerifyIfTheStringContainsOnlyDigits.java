package javaPrograms;

import org.testng.annotations.Test;

public class VerifyIfTheStringContainsOnlyDigits {
@Test
public void stringDigits() {
	String given ="sd98u89";
	boolean flag=true;;
	for(int i=0; i<given.length();i++) {
		if(!Character.isDigit(given.charAt(i))) {
			flag = false;
			break;
		}
	}
	if(flag==true) {
		System.out.println("The string contains only digits");
	}
	else {
		System.out.println("The string contains non digits");
	}
}
}
