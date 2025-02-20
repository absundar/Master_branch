package javaPrograms;

import java.util.Scanner;

import org.testng.annotations.Test;

public class PalindromeString {
@Test
public void stringPalindrome() {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the string : ");
	String str = scanner.next();
	String rev="";
	String originalString = str;
	for(int i= str.length()-1; i>=0;i--) {
		rev=rev+str.charAt(i);
	}
	if(rev.equals(originalString)) {
		System.out.println(originalString + " Entered string is a palindrome");
	}else {
		System.out.println(originalString + " Entered string is not a palindrome");
	}
}
}
