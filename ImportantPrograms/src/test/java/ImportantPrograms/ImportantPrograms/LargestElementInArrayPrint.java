package ImportantPrograms.ImportantPrograms;

import org.testng.annotations.Test;

public class LargestElementInArrayPrint {
	@Test
	public void Largest() {
		int[] arr = {72,57,26,89,23,67};
int size= arr.length;
int largest = arr[0];
for(int i=1;i<size;i++) {
	if(arr[i]>largest) {
		largest = arr[i];
	}
}
System.out.println("The largest element is: " + largest);
	}
	
}

