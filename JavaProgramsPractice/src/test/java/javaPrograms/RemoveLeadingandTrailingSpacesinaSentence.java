package javaPrograms;

import org.testng.annotations.Test;

public class RemoveLeadingandTrailingSpacesinaSentence {
@Test
public void removeLeadingAndTrailingSpaces() {
	String given = " Abhinaya is a good girl ";
	//System.out.println(given.trim());
//System.out.println(given.replaceAll("^[ \t]+|[ \t]+$", ""));
//System.out.println(given.replaceAll("^[ \t]", ""));
	System.out.println(given.replaceAll("[ \t]+$",""));
}
}
