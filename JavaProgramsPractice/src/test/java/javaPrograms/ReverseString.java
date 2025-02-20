package javaPrograms;

import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.testng.annotations.Test;

public class ReverseString {
@Test
public void usingStringBuffer() {
	String toReverse ="AbhinayaSundar";
//	System.out.println(toReverse.indexOf('a', 0));
//	System.out.println(toReverse.indexOf('a', toReverse.indexOf('a')+1));
//	System.out.println(toReverse.indexOf(('a'), toReverse.indexOf('a')+toReverse.indexOf('a')+1));
	StringBuffer buffer = new StringBuffer();
	buffer.append(toReverse);
	StringBuffer reversed = buffer.reverse();
	System.out.println(reversed);
}
@Test
public void usingOwnMethod() {
	String toReverse = "LeelaSundar";
	char[] characterArray= toReverse.toCharArray();
	String reversed = "";
	for(int i= characterArray.length-1; i>=0;i--) {
		reversed = reversed+characterArray[i];
	}
	System.out.println(reversed);
}
@Test
public void usingCollections() {
	String toReverse ="AshwanthSRagav";
	char[] array = toReverse.toCharArray();
	String reversed ="";
	List<Character> list = new ArrayList<Character>();
	for (Character character : array) {
		list.add(character);
	}
	Collections.reverse(list);
	ListIterator iterator = list.listIterator();
	while(iterator.hasNext()) {
		System.out.println(iterator.next());
	}
}
}