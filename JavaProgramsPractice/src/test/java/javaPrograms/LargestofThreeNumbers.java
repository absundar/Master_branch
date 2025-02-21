package javaPrograms;

import java.util.Scanner;

import org.testng.annotations.Test;

public class LargestofThreeNumbers {
@Test
public void firstMethod() {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the first number");
	int a = scanner.nextInt();
	System.out.println("Enter the second number");
	int b = scanner.nextInt();
	System.out.println("Enter the third number");
	int c = scanner.nextInt();
	if(a>b && a>c) {
		System.out.println("First number is the largest");
	}
	if(b>a && b>c) {
		System.out.println("Second number is the largest");
	}
	if(c>a && c>b) {
		System.out.println("Third number is the largest");
	}
	else {
		System.out.println("The numbers are equal");
	}
}
@Test
public void usingTernaryOperator() {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the first number");
	int a = scanner.nextInt();
	System.out.println("Enter the second number");
	int b = scanner.nextInt();
	System.out.println("Enter the third number");
	int c = scanner.nextInt();
	/*
	 * int largest1 = a>b?a:b; int largest2 = c>largest1? c:largest1;   //if a>b then returns true else returns false
	 * System.out.println(largest2 + "is the largest");
	 */
	//or as a single line 
	int largest = c>(a>b?a:b)?c:(a>b?a:b);
	System.out.println(largest + "is the largest");
}
}
