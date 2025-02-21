package javaPrograms;

import org.testng.annotations.Test;

public class ReverseWordsinaSentence {
@Test
public void reverse() {
	String given = "Abhinaya Ragav Leela";
	String reversed = "";
	String[] temp = given.split(" ");
	System.out.println(temp.length);
	for(int i=temp.length-1; i>=0; i--) {
		reversed = reversed+ temp[i]+ " ";
	}
	System.out.println(reversed);
}
	
}
