package javaPrograms;

import java.util.Arrays;

import org.testng.annotations.Test;

public class TwoArraysorEqualorNot {
@Test
public void usingArrayMethod() {
	int[] a1= {1,2,45,7893,7322,52};
	int[] a2= {1,3,627384,73,36,24};
boolean status=	Arrays.equals(a1, a2);
System.out.println(status);
}

@Test
public void withoutArrays() {
	int[] a1= {2,6,62,62,72,742,62};
	int[] a2= {987,25,62,72,87,90};
	boolean status = false;
	if(a1.length==a2.length){
		for(int i=0;i<a1.length;i++) {
			if(a1[i]!=a2[i]) {
				status = false;
			}
		}
	}
	else {
		status=false;
	}
	if(status==true) {
		System.out.println("Arrays are equal");
	}
	else {
		System.out.println("Arrays are not equal");
	}
}
}
