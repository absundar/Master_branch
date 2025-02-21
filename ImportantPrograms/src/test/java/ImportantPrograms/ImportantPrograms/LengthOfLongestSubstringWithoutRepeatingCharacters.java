package ImportantPrograms.ImportantPrograms;

import org.testng.annotations.Test;

public class LengthOfLongestSubstringWithoutRepeatingCharacters {
@Test
public void SubstringLength() {
	String str = "ahiuhhiui";
	int n=str.length();
	int maxLength =0;
	int[] charIndex = new int[128];
	int windowStart=0;
	for(int windowEnd =0; windowEnd<n; windowEnd++) {
		char rightChar = str.charAt(windowEnd);
		windowStart =Math.max(windowStart, charIndex[rightChar]);
		charIndex[rightChar]=windowEnd+1;
		maxLength =Math.max(maxLength, windowEnd-windowStart+1);
		System.out.println(maxLength); 
	}
}
}
