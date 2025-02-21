package ImportantPrograms.ImportantPrograms;

import org.testng.annotations.Test;

public class StringIsAPalindromeOrNot {
@Test
public void PalindromeOrNot() {
	String str = "abhsdfgihba"; 
	String reversedString= new StringBuilder(str).reverse().toString();
	System.out.println(reversedString);  // just enough for reverse string
	if(str.equals(reversedString)) {
		System.out.println("The given string is a palindrome");
	}
	else {
		System.out.println("The given string is not a palindrome");
	}
}
}
