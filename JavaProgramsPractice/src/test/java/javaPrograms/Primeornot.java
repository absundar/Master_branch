package javaPrograms;

import org.testng.annotations.Test;

public class Primeornot {
@Test
public void prime() {
	int given = 3;
	int count=0;
	if(given>1) {
		for(int i=1;i<=given;i++) {
			if(given%i==0) 
				count++;
		}
			if(count==2) {
				System.out.println("Entered number is a prime number");
			}
			else {
				System.out.println("Entered number is not a prime number");
			}
		}
		else {
			System.out.println("Entered number is not a prime number");

		}
	}
}
