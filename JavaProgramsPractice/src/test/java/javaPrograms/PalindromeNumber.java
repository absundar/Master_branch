package javaPrograms;

import java.util.Scanner;

import org.testng.annotations.Test;

public class PalindromeNumber {
@Test
public void palindrome() {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the number");
	int num = scanner.nextInt();
	int originalNumber = num;
	int rev =0;
	while(num!=0) {
		rev = rev*10+num%10;
		num =num/10;
	}
	if(originalNumber==rev) {
		System.out.println(originalNumber + " Entered number is a palindrome");

	}
	else {
		System.out.println(originalNumber + " Entered number is not a palindrome");
	}
}
}
