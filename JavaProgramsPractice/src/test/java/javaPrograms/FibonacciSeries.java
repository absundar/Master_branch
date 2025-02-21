package javaPrograms;

import org.testng.annotations.Test;

public class FibonacciSeries {
@Test
public void fibonacci() {
	// 0 1 1 2 3 5 8 13
	int n1= 0;
	int n2=1;
	int sum =0;
	System.out.println(n1+ " " + n2);
	for(int i=2;i<=10;i++) {
	sum = n1+n2;
	System.out.print(" "+sum);
	n1=n2;
	n2=sum;
	}
	
}
}
