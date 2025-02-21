package javaPrograms;

import org.testng.annotations.Test;

public class PrintOddAndEven {
@Test
public void usingForLoop() {
	int a[]= {1,2,3,4,5,6,7,8,9};
	System.out.println("The even numbers are ........");
	for(int i=0;i<a.length;i++) {
		if(a[i]%2==0) 
			System.out.println(a[i]);
	}
	System.out.println("The odd numbers are........");
	for(int i=0;i<a.length;i++) {
		if(a[i]%2!=0) 
			System.out.println(a[i]);
	}
}

@Test
public void usingForEachLoop() {
	int a[] = {1,2,4,5,6,2,7,356,72};
	System.out.println("The even number are.........");
	for (int value : a) {
		if(value%2==0)
			System.out.println(value);
	}
	System.out.println("The odd number are...........");
	for(int value : a) {
		if(value%2!=0)
			System.out.println(value);
	}
}
}
