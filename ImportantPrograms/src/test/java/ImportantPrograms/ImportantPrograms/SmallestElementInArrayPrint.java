package ImportantPrograms.ImportantPrograms;

import org.testng.annotations.Test;

public class SmallestElementInArrayPrint {
@Test
public void Smallest() {
	int[] arr= {12,63,72,157,1,573,772};
	int size= arr.length;
	int smallest =arr[0];
	for(int i=1;i<size;i++) {
		if(arr[i]<smallest) {
			smallest = arr[i];
		}
	}
	System.out.println("The smallest element is :" + smallest);
}
}
