package ImportantPrograms.ImportantPrograms;

import org.testng.annotations.Test;

public class RemoveWhiteSpace {
@Test
public void RemoveSpace() {
	String str = "a b & c d * e f g # h3 48u 98u2";
	String replaced =str.replaceAll("\\s+", "");
	System.out.println(replaced);
}
}
