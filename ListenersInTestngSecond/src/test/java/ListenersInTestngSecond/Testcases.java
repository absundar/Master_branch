package ListenersInTestngSecond;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Testcases {
@Test
public void TestToPass() {
Assert.assertTrue(true);
}
@Test
public void TestToFail() {
	Assert.assertFalse(false);
}
}
