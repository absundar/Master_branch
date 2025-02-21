package ImportantPrograms.ImportantPrograms;

import org.testng.annotations.Test;

public class SumOfAllItemsOfArray {
@Test
public void Sum() {
	int[] arr= {2,5,6,27,278,289};
	int size= arr.length;
	int sum =0;
	for(int number : arr) {
		sum+= number;
	}
	System.out.println("The sum of the array is :" + sum);
}
}
