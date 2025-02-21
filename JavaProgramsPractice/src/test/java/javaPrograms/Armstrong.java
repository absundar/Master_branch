package javaPrograms;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Armstrong {
@Test
public void armstrongNumber() {
	System.out.println("Enter the number: ");
	Scanner scanner = new Scanner(System.in);
	int given = scanner.nextInt();
	//153
	//1x1x1=1 + 5x5x5=125 + 3x3x3= 27 = 153
	int cube=0;
	int remainder=0;
	int temp=given;
	while(given>0) {
		remainder=given%10;
		given = given/10;
		cube=cube+(remainder*remainder*remainder);
	}
	if(temp==cube) {
		System.out.println("The number is an armstrong number");
	}
	else {
		System.out.println("The number is not an armstrong number");
	}
}
}
