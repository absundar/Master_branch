package ImportantPrograms.ImportantPrograms;

import org.testng.annotations.Test;

public class OddAndEven {
@Test
public void OddAndEvenNumbers() {
	int arr[] = {1,2,3,4,5,6,7,8,9,10};
	int size = arr.length;
	System.out.println("Even numbers :");
	for(int i=0;i<size;i++) {
		if(arr[i]%2==0) {
			System.out.print(arr[i] + " ");
		}
	}
	System.out.println("Odd numbers : ");
	for(int i =0;i<size;i++) {
		if(arr[i]%2!=0) {
			System.out.print(arr[i] + " ");
		}
	}
}
}
