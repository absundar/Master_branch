package javaPrograms;

import org.testng.annotations.Test;

public class MissingNumberinanArray {
@Test
public void missingNumber() {
	//should not have duplicates
	//can be in any order need not to be sorted
	//should be within a range
	int a[] = {1,2,5,4};
	// 1+2+5+4 = 12 = sum1
	// 1+2+3+4+5= 15 = sum2 sum2-sum1 =missing number
	int sum1=0;
	int sum2=0;
	for(int i=0; i<a.length;i++) {
		sum1=sum1+a[i];
	}
	System.out.println("Sum of elements in array " + sum1);
	for(int i=1;i<=5;i++) {
		sum2=sum2+i;
	}
	System.out.println("Sum of the range of elements " + sum2);
	System.out.println("Missing element is "+ (sum2-sum1));
}
}
