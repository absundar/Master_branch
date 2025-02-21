package ProgramsPractice.ProgramsPractice;

import java.util.HashSet;
import java.util.Set;

import org.testng.annotations.Test;

public class RemoveDuplicatesfromArray {
@Test
public void removeDup() {
	int[] a={34,67,26,15,42,67};
	//for(int i=0;i<=a.length;i++) {
	//if(a[i]=)	
/*int largest =a[0];
for(int i=1;i<a.length;i++) {
	if(a[i]>largest) {
		largest=a[i];
		System.out.println(largest);
	/*int dup =a[0];
	for(int i=1;i<a.length;i++) {
	if(a[i]==a[i+1])	{
		dup =a[i+1];
		System.out.println(dup);*/
Set<Integer> seen = new HashSet<Integer>();
Set<Integer>duplicates = new HashSet<Integer>();
for(int element:a) {
			if(!seen.add(element)) {
				duplicates.add(element);
				System.out.println(duplicates);
		}
	}
	}
	}
	

