package javaPrograms;

import java.util.Scanner;

import org.testng.annotations.Test;

public class ReverseANumber {
@Test
public void reverseNumber() {
	int givenNumber =0;
	int reversedNumber =0;
	System.out.println("Enter the number:");
	Scanner scanner = new Scanner(System.in);
	givenNumber = scanner.nextInt();
	while(givenNumber!=0) {
		reversedNumber = reversedNumber*10;
		reversedNumber= reversedNumber+givenNumber%10;
		givenNumber=givenNumber/10;
	}
	System.out.println("The reversed number :" + reversedNumber);
	}
}

