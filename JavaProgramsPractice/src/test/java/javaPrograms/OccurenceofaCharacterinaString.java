package javaPrograms;

import org.testng.annotations.Test;

public class OccurenceofaCharacterinaString {
@Test
public void occurenceUsingIterator() {
	String given = "AbhinayaSundar";
	char toFind ='a';
	int occurence=0;
given=	given.toLowerCase();
for(int i=0;i<given.length();i++) {
	if(given.charAt(i)==toFind) {
		occurence = occurence+1;
	}
}
System.out.println( toFind  +  " is present " +  occurence  +  " number of times");
}
@Test
public void occurenceWithoutUsingIteration() {
	String given ="LeelaRagav";
	char toFind ='e';
	given = given.toUpperCase();
	String characterToFind = Character.toString(toFind).toUpperCase();
	int actualLength = given.length();
	System.out.println(actualLength);
given = given.replace(characterToFind, "");
int lengthAfterReplacing = given.length();
System.out.println(lengthAfterReplacing);
System.out.println(actualLength-lengthAfterReplacing);
}
}


