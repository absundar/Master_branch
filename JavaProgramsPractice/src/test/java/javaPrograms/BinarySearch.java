package javaPrograms;

import java.util.Arrays;

import org.testng.annotations.Test;

public class BinarySearch {
@Test
public void search() {
	int[] given = {1,2,3,4,5,6,7,8,9,10};  // should be in sorted order
	boolean flag=false;
	int key=100;
	int lowerLimit=0;
	int higherLimit= given.length-1;
	while(lowerLimit<=higherLimit) {	
	int middle= (lowerLimit+higherLimit)/2;
	if(given[middle]==key) {
		System.out.println("Element found");
		flag=true;
		break;
	}
	if(given[middle]<key) {
		lowerLimit=middle+1;
	}
	if(given[middle]>key) {
		higherLimit=middle-1;
	}
	}
	if(flag==false) {
		System.out.println("Element not found");
	}
}
@Test
public void arraysBinarySearch() {
	int[] given = {1,2,3,4,5,6,7,8,9,10};
	System.out.println(Arrays.binarySearch(given, 10)); // if number is present gives its position
	System.out.println(Arrays.binarySearch(given, 0)); // if number is not present gives negative number
}
}
