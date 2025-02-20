package javaPrograms;

import org.testng.annotations.Test;

public class SumofElementsinanArray {
@Test
public void withForLoopMethod() {
	int a[]= {2,5,16,83,84};
	int sum=0;
	for(int i=0; i<=a.length-1;i++) {
		sum =sum+a[i];
	}
		System.out.println(sum);
	
}
@Test
public void forEachMethod() {
	int a[] = {32,21,65,76,21,621};
	int sum=0;
	for (int value : a) {
		sum=sum+value;
	}
	System.out.println(sum);
	}
}

