package ImportantPrograms.ImportantPrograms;

import java.util.Arrays;

import org.testng.annotations.Test;

public class ReverseElementsInArray {
	@Test
	public void Reverse() {
int[] a = {23,56,25,74,25,86,90,35,63,47,28};
int size= a.length;
/*//System.out.println("Before reversing " + a);
//for(int i=0;i>size;i--) {
//	System.out.println("After reversing " + a[i]);

System.out.println("Before reversing: " + Arrays.toString(a));
int start =0;
int end = size-1;
while(start<end) {
	int temp =a[start];
	a[start]=a[end];
	a[end]=temp;
	start++;
	end--;
	System.out.println("After reversing:" + Arrays.toString(a));
	}*/
//Another method
for(int i= size-1;i>=0;i--) {
	System.out.println(a[i] + "");
	
}
}
	}

//Before reversing: [23, 56, 25, 74, 25, 86]
//After reversing:[86, 56, 25, 74, 25, 23]
//After reversing:[86, 25, 25, 74, 56, 23]
//After reversing:[86, 25, 74, 25, 56, 23]