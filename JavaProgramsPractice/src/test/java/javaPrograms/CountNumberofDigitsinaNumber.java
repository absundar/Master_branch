package javaPrograms;

import org.testng.annotations.Test;

public class CountNumberofDigitsinaNumber {
@Test
public void numberOfDigits() {
	int givenNumber = 123456789;
	int count =0;
	while(givenNumber!=0) {
		givenNumber = givenNumber/10;
		count++;
	}
	System.out.println(count);
}
}
