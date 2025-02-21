package coding;

import static org.testng.Assert.assertEquals;

import org.junit.Test;


public class Subraction {
@Test
	public void subTwoNumbers() {
		int subAnswer = 2-2;
		assertEquals(0, subAnswer);
		System.out.println(subAnswer);
	}
@Test
public void divide() {
	int divAnswer= 4/2;
	assertEquals(2, divAnswer);
	System.out.println(divAnswer);
}
@Test
public void mul() {
	int mulAnswer = 2*2;
	assertEquals(mulAnswer, 4);
	System.out.println(mulAnswer);
}
}
