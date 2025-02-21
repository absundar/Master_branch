package ImportantPrograms.ImportantPrograms;

import org.testng.annotations.Test;

public class SecondSmallest {
@Test
public void SecondSmallestElement() {
	int arr[] = {32,62,136,37,9854,23,12};
	int size = arr.length;
	if(size<2)
	{
		System.out.println("Array size is too small to find the second smallest element");
		return;
	}
	int smallest = Integer.MAX_VALUE;
	int secondSmallest = Integer.MAX_VALUE;
	for(int i=0; i<size;i++) {
		if(arr[i]<smallest) {
			secondSmallest = smallest;
			smallest= arr[i];
		}
			else if(arr[i]<secondSmallest && arr[i]!= smallest) {
secondSmallest = arr[i];
}
		}
	System.out.println("Smallest :" + smallest);
	System.out.println("Second Smallest :" + secondSmallest);
	}
}

