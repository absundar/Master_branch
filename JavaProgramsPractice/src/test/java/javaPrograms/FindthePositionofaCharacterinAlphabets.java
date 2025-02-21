package javaPrograms;

import java.util.Scanner;

import org.testng.annotations.Test;

public class FindthePositionofaCharacterinAlphabets {
@Test
public void positions() {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the character :");
	char givenChar = scanner.next().charAt(0);
	givenChar = Character.toLowerCase(givenChar);
	int asciiValue = (int)givenChar;
	int position = asciiValue-96;
	System.out.println(position);
	
}
}