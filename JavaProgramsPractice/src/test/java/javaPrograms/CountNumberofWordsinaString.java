package javaPrograms;

import java.util.Scanner;

import org.testng.annotations.Test;

public class CountNumberofWordsinaString {
@Test
public void count() {
System.out.println("Enter the String ");
Scanner scanner = new Scanner(System.in);
String entered= scanner.nextLine();
int count=1;
	for(int i=0;i<=entered.length()-1;i++) {
		if((entered.charAt(i)== ' ') && (entered.charAt(i+1)!= ' ')) {  //after a space it should not have another space it should have a character after a space
			count++;
		}
	}
	System.out.println("The number of words in the string is :" + count);
}
}
