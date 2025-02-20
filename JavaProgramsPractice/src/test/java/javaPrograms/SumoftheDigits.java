package javaPrograms;

import org.testng.annotations.Test;

public class SumoftheDigits {
@Test
public void sum() {
	int given = 187998;
	int sum =0;
	while(given>0) {
		sum =sum+given%10;
		given=given/10;
	}
	System.out.println(sum);

}
}