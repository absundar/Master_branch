package javaPrograms;

import java.util.Arrays;

import org.testng.annotations.Test;

public class BubbleSort {
@Test
public void sort() {
	int[] given = {2,29,6,7,69,39};
	System.out.println("Before sorting: " + Arrays.toString(given));
	int numberOfPasses= given.length;
	for(int i=0;i<numberOfPasses-1;i++) {       //Number of passes
		for(int j=0; j<numberOfPasses-1;j++) {   //iteration in each pass
			if(given[j]>given[j+1]) {  //if element is greater than second element then swap
				int temp = given[j];
				given[j]=given[j+1];
				given[j+1]=temp;			
			}
		}
	}
	System.out.println("After sorting :" + Arrays.toString(given));
}
}
