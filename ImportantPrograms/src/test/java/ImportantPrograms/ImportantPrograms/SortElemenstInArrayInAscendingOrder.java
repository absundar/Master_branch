package ImportantPrograms.ImportantPrograms;

import java.util.Arrays;

import org.testng.annotations.Test;

public class SortElemenstInArrayInAscendingOrder {
@Test
public void Ascending() {
	int arr[]= {7657,24,15,6211,62,61,423,53,62};
	int size= arr.length;
	System.out.println("Before sorting :" + Arrays.toString(arr));
	Arrays.sort(arr);	
	System.out.println("After sorting :" + Arrays.toString(arr));
}
}
