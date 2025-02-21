package javaPrograms;

import java.util.Arrays;
import java.util.HashSet;

import org.testng.annotations.Test;

public class MissingAphabetinaString {
@Test
public void missingAlphabet() {
	String given ="abcde  fghijklmn opqrs tuvwxyz";
	given=given.toUpperCase();
	given=given.replaceAll(" ", "");
	String [] userArray = given.split("");
	String[] alphabets= "abcdefghijklmnopqrstuvwxyz".split("");
	HashSet<String> set1 = new HashSet<String>(Arrays.asList(userArray));
	HashSet<String> set2 = new HashSet<String>(Arrays.asList(alphabets));
	set2.removeAll(set1);
	System.out.println(set2);
}
}
