package javaPrograms;

import java.util.Iterator;

import org.testng.annotations.Test;

public class ReplaceVowelsWithSpecialCharacters {
@Test
public void normalMethod() {
	String given = "I am a good girl";
	char[] characterArray = given.toCharArray();
	for(int i=0;i<given.length();i++) {
		if(given.charAt(i)=='A' || given.charAt(i)== 'E' || given.charAt(i)== 'I' || given.charAt(i)=='O' 
				|| given.charAt(i)=='U' || given.charAt(i)== 'a' || given.charAt(i)== 'e' || given.charAt(i)=='i' 
				|| given.charAt(i)== 'o' || given.charAt(i)=='u'){
					characterArray[i] = '*';
				}
	}
		for(int i=0;i<given.length();i++) {
			System.out.print(characterArray[i]);

		
	}
}
@Test
public void usingRegEx() {
	String given = "Amma is the best";
	String replacedText =given.replaceAll("[AEIOUaeiou]", "\\$");  //similarly to remove special characters or spaces too
	System.out.println(replacedText);
	String newString = "*(&(*&(*&*^^^&##@$@$#$#$#$ Abhi is an Engineer5995271290411964";
	String newReplacedText= newString.replaceAll("[^a-zA-Z0-9]", "");
	System.out.println(newReplacedText);
}
}
