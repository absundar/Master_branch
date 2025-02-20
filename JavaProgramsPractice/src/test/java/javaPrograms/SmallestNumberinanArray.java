package javaPrograms;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.testng.annotations.Test;

public class SmallestNumberinanArray {
	@Test
	public void smallest() {
		int givenArray[] = {23,5,525,636,742};
		int smallest = Integer.MAX_VALUE;
		for(int i=0; i<givenArray.length;i++) {
			while(givenArray[i]<smallest) {
				smallest = givenArray[i];
			}
		}
		System.out.println(smallest);
	}
	@Test
	public void usingArrays() {
		int givenArray[] = {23,89,8,525,36,742};
		Arrays.sort(givenArray);
		int smallest = givenArray[0];
		System.out.println(smallest);
	}
	@Test
	public void usingCollections() {
		Integer givenArray[] = {23,89,56,525,36,742,1};
		List<Integer> list = Arrays.asList(givenArray);
		Collections.sort(list);
		int smallest = list.get(0);
		System.out.println(smallest);



	}
}

