package javaPrograms;

import org.testng.annotations.Test;

public class Factorial {
@Test
public void wihoutRecursive() {
	int given = 10;
	long factorial = 1;
//	for(int i=1; i<=given; i++) {
//		factorial = factorial * i;
//	}
	for(int i=given; i>=1;i--) {
		factorial = factorial*i;
	}
		System.out.println(factorial);
	
}
@Test
public void recursiveMethod() { //recursive is a function calling itself
	int result= recursive(3);
System.out.println(result);
}
private int recursive(int i) {
	if(i==0) 
		return 1;
	else
		return(i*recursive(i-1));
}

}
