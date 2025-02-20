package javaPrograms;

import org.testng.annotations.Test;

public class MinimumAndMaximuminanArray {
@Test
public void minAndMax() {
	int[] a = {17,70,37,95,27};
	int max=a[0];
	for(int i=1;i<a.length;i++) {
		if(a[i]>max) {
max=a[i];
}
	}
	System.out.println("The maximum number is :"+max);
int min= a[0];
for(int i=1;i<a.length;i++) {
	if(min>a[i]) {
		min=a[i];
	}
}
System.out.println("The minimum number is :" + min);
}
}
