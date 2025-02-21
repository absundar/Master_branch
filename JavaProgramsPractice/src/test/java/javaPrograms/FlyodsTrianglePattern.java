package javaPrograms;

import java.util.Iterator;
import java.util.Scanner;

import org.testng.annotations.Test;

public class FlyodsTrianglePattern {
	@Test
	public void printStars() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int numberoflines = scanner.nextInt();
		int row, column;
		for(row=0;row<=numberoflines;row++) {
			for(column=0;column<=row;column++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	@Test
	public void printNumbers() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number :");
		int limit;
		limit= scanner.nextInt();
		int startingNumber=1;
		int row, column;
		for(row=0;row<=limit;row++) {
			for(column=0;column<row;column++) {
				System.out.print(startingNumber + " ");
				startingNumber = startingNumber+1;
			}
			System.out.println();
		}
	}
}