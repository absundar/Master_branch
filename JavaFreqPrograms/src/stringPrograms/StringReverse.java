package stringPrograms;

import java.lang.reflect.Array;

public class StringReverse {

	public static void main(String[] args ) {
//String first = "Abhi";
//StringBuffer buffer = new StringBuffer();
//StringBuffer reversed = buffer.append(first);
//System.out.println(buffer.reverse());
	}

	public void AnotherMethod() {
		String given = "Abhi";
		char[] characterArray = given.toCharArray();
		String reversed ="";
		for(int i = characterArray.length-1; i>=0; i--) {
			reversed = reversed+characterArray[i];
		}
		System.out.println(reversed);	
		}
	}


