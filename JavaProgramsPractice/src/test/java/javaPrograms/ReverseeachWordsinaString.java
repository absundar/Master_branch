package javaPrograms;

import org.testng.annotations.Test;

public class ReverseeachWordsinaString {
@Test 
public void bySpilttingUsingLoops() {
	String given = "Java and Selenium are interesting";
	String reversedString= "";
	String[] words= given.split(" ");
	for (String w : words) {
		String reverseWords= "";
		for(int i=w.length()-1;i>=0;i--) {
			reverseWords=reverseWords+w.charAt(i);
		}
		reversedString= reversedString+reverseWords+" ";
	}
	System.out.println(reversedString);
}
@Test
public void byBuiltInMethod() {
	String given = "Selenium and Java are interesting";
	String reversedString="";
	String[] words= given.split(" ");
	for (String w : words) {
		StringBuilder sb= new StringBuilder(w);
		sb.reverse();
		reversedString= reversedString+sb.toString()+" ";
	}
	System.out.println(reversedString);	
}
@Test
public void withoutSpiltting() {
	String given = "Java and Selenium are interesting";
	StringBuilder result = new StringBuilder();
	StringBuilder word = new StringBuilder();
	for(int i=0;i<given.length();i++) {
		char currentChar= given.charAt(i);
		if(currentChar!= ' ') {
			word.append(currentChar);
		}
		else {
			result.append(word.reverse());
			result.append(" ");
			word.setLength(0);
		}
	}
	result.append(word.reverse());
	System.out.println(result);
}
}
