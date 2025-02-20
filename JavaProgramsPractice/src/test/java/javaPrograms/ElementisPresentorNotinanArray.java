package javaPrograms;

import java.io.InputStream;
import java.util.stream.IntStream;

import org.testng.annotations.Test;

public class ElementisPresentorNotinanArray {
@Test
public void elementPresentornot() {
	int[] given = {21,453,56,126,15,21,56};
	int numberToFind= 21;
	boolean found = false;
	for (int number : given) {
		if(number==numberToFind) {
			if(found =true) {
			System.out.println("Number is present");
			//break;
		}
		else {
			System.out.println("Number is not present");
		}
	}
}
}
@Test
public void usingIntStream() {
	int[] given = {31,432,54,14,67,74};
	int numberToFind = 75;
	boolean found = IntStream.of(given).anyMatch(element->element==numberToFind);
	if(found) {
		System.out.println("Number is present");
	}
	else {
		System.out.println("Number is not present");
	}
	
}
}