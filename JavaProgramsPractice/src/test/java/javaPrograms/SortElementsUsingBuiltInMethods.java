package javaPrograms;

import java.util.Arrays;
import java.util.Collections;

import org.testng.annotations.Test;

public class SortElementsUsingBuiltInMethods {
@Test
public void parallelSort() {
	int[] given= {2,84,24,732,21,82};
	System.out.println("Before sorting : "+ Arrays.toString(given));
	Arrays.parallelSort(given);
	System.out.println("After sorting : " + Arrays.toString(given));
}
@Test
public void sortMethod() {
	int[] given= {4,52,6,67,123,71,8};
	System.out.println("Before sorting : " + Arrays.toString(given));
	Arrays.sort(given);
	System.out.println("After sorting : " + Arrays.toString(given));
}
@Test
public void collectionsToReverseMethodForDescendingOrderSort() {
	Integer given[]= {3,7,12,72,1,73,11,12};
	System.out.println("Before sorting : "+ Arrays.toString(given));
	Arrays.sort(given, Collections.reverseOrder());
	System.out.println("After sorting : " + Arrays.toString(given));
}
}
