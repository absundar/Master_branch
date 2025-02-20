package ImportantPrograms.ImportantPrograms;

import org.testng.annotations.Test;

public class SecondLargestElementInArray {
@Test
public void SecondLargest() {
	int[] arr= {35,52,627,34,146,46,13};
	int size = arr.length;
	if(size<2) {
		System.out.println("Array is too small to find the second largest element");
		return;
	}
int largest = Integer.MIN_VALUE;
int secondLargest = Integer.MIN_VALUE;
for(int i=0;i<size;i++) {
	if(arr[i]>largest) {
	secondLargest = largest;
	largest =arr[i];
	}
	else if(arr[i]>secondLargest && arr[i]!=largest){
	secondLargest=arr[i];	
	}
}
System.out.println("Largest : " + largest);
System.out.println("Second Largest : " + secondLargest);
}
}
