package ImportantPrograms.ImportantPrograms;

import org.testng.annotations.Test;

public class PrintFirstLetterOfEachWordInString {
@Test
public void FirstLetter() {
	String str = "Abhi is a good girl and angel";
	String[] words = str.split(" ");
	for(String word : words) {
		System.out.print(word.charAt(0));
		
	}
}
}
