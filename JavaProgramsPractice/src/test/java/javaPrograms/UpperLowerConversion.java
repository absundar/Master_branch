package javaPrograms;

import org.testng.annotations.Test;

public class UpperLowerConversion {
@Test
public void toLower() {
	String given = "ABHINAYA leela Ragav";
	char[] character= given.toCharArray();
	for(int i=0; i<given.length();i++) {
		if(character[i]>=65 && character[i]<=90) {
			//following ascii
			character[i]= (char) (character[i]+32);
		}
	}
	for(int i =0;i<given.length();i++) {
		System.out.print(character[i]);
	}
}

@Test
public void toUpper() {
	String given ="LEELA abhinaya RAGAV";
	char[] character = given.toCharArray();
	for(int i=0;i<given.length();i++) {
		if(character[i]>=97 && character[i]<=122) {
			character[i]= (char) (character[i]-32);
		}
	}
	for(int i=0;i<character.length;i++) {
		System.out.print(character[i]);
	}
}
}
