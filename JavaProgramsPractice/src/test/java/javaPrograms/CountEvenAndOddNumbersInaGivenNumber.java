package javaPrograms;

import org.testng.annotations.Test;

public class CountEvenAndOddNumbersInaGivenNumber {
@Test
public void countEvenandOdd() {
	int given = 123455;
	int oddCount= 0;
	int evenCount =0;
	while(given>0) {
		int rem = given%10;
		if(rem %2==0) {
	evenCount++;	
	}
		else {
			oddCount++;
		}
given=given/10;
}
	System.out.println("Number of even numbers :" + evenCount);
	System.out.println("Number of odd numbers :" + oddCount);

}
}
