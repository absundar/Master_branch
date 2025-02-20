package javaPrograms;

import org.testng.annotations.Test;

public class LinearSearch {
@Test
public void search() {
	int[] a= {10,20,50,29,60};
	int searchNum= 29;
	boolean flag = false;
	for(int i=0;i<a.length;i++) {
	//	System.out.println(a[i]);
		if(searchNum==a[i]) {
			System.out.println("Element found at : "+ i);
			flag=true;
			break;
		}
	}
	if(flag==false) {
		System.out.println("Element not found");
	}
}
}
