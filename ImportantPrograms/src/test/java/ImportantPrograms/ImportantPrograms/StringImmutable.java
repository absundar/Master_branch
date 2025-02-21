package ImportantPrograms.ImportantPrograms;

import org.testng.annotations.Test;

public class StringImmutable {
@Test
public void StringImmutableProof() {
	String str1 = "Abhi";
	String str2 = str1.concat(" Angel");
System.out.println("str1 : " + str1);
System.out.println("str2 : " + str2);
}
}
