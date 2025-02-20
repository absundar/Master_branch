package coding;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.junit.Test;

public class IntegerTypes {
@Test
/*public void IntegerTypesExamples() {
byte aByteHas1Bytes;
short aShortHas2Bytes;
int anIntHas4Bytes;
long aLongHas8Bytes;

System.out.println(Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
System.out.println(Short.MIN_VALUE + " to " + Short.MAX_VALUE);
System.out.println(Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
System.out.println(Long.MIN_VALUE + " to " + Long.MAX_VALUE);

aByteHas1Bytes = 0xA;
assertEquals(10, aByteHas1Bytes);
aLongHas8Bytes =0L;
assertEquals(0, aLongHas8Bytes);
anIntHas4Bytes = 010;
assertEquals(8, anIntHas4Bytes);
aByteHas1Bytes = 0b0010;
assertEquals(aByteHas1Bytes, 2);
aLongHas8Bytes = 9_000_000_000L;
assertEquals(900000000L, aLongHas8Bytes);*/

//public void TrueValidation() {
//boolean truthy=true;
//if(truthy) {
//	assertTrue(truthy);
//}
//else{
//assertFalse(truthy);
//}
//}
//public void FalseValidation() {
//	boolean truthy = true;
//	if(!truthy) {
//		assertTrue(truthy);
//	}
//		else {
//			assertFalse(!truthy);
//		}
//	}
public void TruthyAndFalsey() {
	boolean truthy = true;
	boolean falsey = false;
	if(truthy) {
		if(!falsey) {
			if(truthy && !falsey) {
				if(falsey || truthy) {
			assertTrue(truthy);
			assertFalse(falsey);
		}
			}
		}	else {
			assertTrue(truthy);
			assertTrue(falsey);
		}
	}
		else {
			if(!truthy) {
				if(falsey) {
					assertFalse(truthy);
					assertTrue(falsey);
				}	
				else {
					assertFalse(falsey);
					assertFalse(truthy);
				}
		}	
	}
	
}
}




















