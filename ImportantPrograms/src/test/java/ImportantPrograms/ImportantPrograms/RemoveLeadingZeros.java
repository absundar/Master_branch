package ImportantPrograms.ImportantPrograms;

import org.testng.annotations.Test;

public class RemoveLeadingZeros {
@Test
public void RemovingLeadingZeros() {
	String str = "002482";
	int i=0;
	while(i<str.length() && str.charAt(i)=='0') {
		i++;
		
	}
	String zerosRemoved =str.substring(i);
	System.out.println(zerosRemoved);
}
}
