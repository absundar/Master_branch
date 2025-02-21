package ProgramsPractice.ProgramsPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.testng.annotations.Test;


public class MergeTwoArrays {
	@Test
	public void mergeUsingArrayCopy() {
int[] num1= {1,2,3,0,0,0};
int[] num2 = {2,5,6};
int[] merge = new int[num1.length+num2.length];   //merge if given just prints the length but element will add and return the array thats is merged
System.arraycopy(num1, 0, merge, 0, num1.length);
System.arraycopy(num2, 0, merge, num1.length, num2.length);
for(int element : merge) {
System.out.print(element+ " ");	
}
}
	@Test
	public void mergeUsingForLoop() {
		int[] a= {4,52,55,25,25};
		int[] b= {6,52,26,78,81};
		int[] merge= new int[a.length+b.length];
		//int[] merge= {};
		int i=0;
		for(int element : a) {
			merge[i++]= element;
		}
		for(int element : b) {
			merge[i++]=element;
		}	
		System.out.println("The merged array :");
		for(int element : merge) {
			System.out.print(element + " ");
		}
	}
	
	@Test
	public void mergeUsingCopyOf() {
	int[] a = {1,2,43,632};
	int[] b= {52,52,673,73};
	int[] mergedArray = Arrays.copyOf(a, a.length+b.length);
System.arraycopy(b, 0, mergedArray, a.length, b.length);
System.out.print(mergedArray);
}
	@Test
	public void mergeUsingApiStream() {
		int[] a = {4,6,2,7,2};
		int[] b= {5,2,7,27,88};
		int[] mergedArray= Stream.of(a,b).flatMapToInt(IntStream::of).toArray();
	System.out.println(mergedArray);
	}
}
























