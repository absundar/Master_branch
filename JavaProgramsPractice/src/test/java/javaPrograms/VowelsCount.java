package javaPrograms;

import org.testng.annotations.Test;

public class VowelsCount {
@Test
public void vowel() {
	String given = "AbhinayaLeelaRagav";
	String characterGiven = given.toLowerCase();
	int vowelCount=0;
	for(int i=0; i<characterGiven.length(); i++) {
		if(characterGiven.charAt(i)=='a' || characterGiven.charAt(i)=='e' || characterGiven.charAt(i)=='i' 
				|| characterGiven.charAt(i)=='o' || characterGiven.charAt(i)=='u') {
			vowelCount++;
		}
	}
	System.out.println(vowelCount);
}
}
