package ImportantPrograms.ImportantPrograms;

import org.testng.annotations.Test;

public class CountNumberOfWordsInString {
@Test
public void CountWords() {
	String str = "Abhi Ragav Leela are the best";
	int count = 0;
	String[] words= str.split("\\s+");
	count = words.length;
	System.out.println(count);
}
}
