package integerExploration;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IntegerExplorationExamples {
@Test
	public void IntegerExploration() {

Integer four = new Integer(4);
assertEquals("intValue return int 4",4, four.intValue());

Integer five = new Integer("5");
assertEquals("intValue returns int 5", 5, five.intValue());

Integer six = 6;
assertEquals("autoboxing assignment for 6",6, six.intValue());
}
@Test
public void excercise() {
assertEquals("b", Integer.toHexString(11));
assertEquals("a", Integer.toHexString(10));
assertEquals("3", Integer.toHexString(3));
assertEquals("15", Integer.toHexString(21));
assertEquals(-2147483648, Integer.MIN_VALUE);
assertEquals(2147483647, Integer.MAX_VALUE);
}
}
