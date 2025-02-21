package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
	public static void main(String[] args) {
		List<Integer> listWithDuplicates = new ArrayList<Integer>();
		listWithDuplicates.add(8);
		listWithDuplicates.add(3);
		listWithDuplicates.add(8);
		listWithDuplicates.add(10);
		listWithDuplicates.add(1);
		Set<Integer> set = new LinkedHashSet<Integer>(listWithDuplicates);
		List<Integer> listWithoutDuplicates = new ArrayList<Integer>(set);
		System.out.println(listWithDuplicates);
		System.out.println(listWithoutDuplicates);
		Collections.sort(listWithoutDuplicates);
		System.out.println(listWithoutDuplicates); 
		
	}
}