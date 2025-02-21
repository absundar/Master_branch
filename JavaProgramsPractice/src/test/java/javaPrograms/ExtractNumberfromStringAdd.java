package javaPrograms;

import org.testng.annotations.Test;

public class ExtractNumberfromStringAdd {
@Test
public void extractNumber() {
	String given ="9Abh5inaya5Sundar9";
	int total =0;
	for(int i =0; i<given.length();i++) {
		char character =given.charAt(i);
		if(Character.isDigit(character)) {
			total =total+Character.getNumericValue(character);
		}
	}
	System.out.println(total);
}
}
