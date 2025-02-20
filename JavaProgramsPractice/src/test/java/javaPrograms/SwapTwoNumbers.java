package javaPrograms;

import org.testng.annotations.Test;

public class SwapTwoNumbers {

	@Test
	public void withThirdVariable() {
		int Abhi = 10;
		int Zukerberg = 30;

		System.out.println("Before swapping : "+ "Mine :" + Abhi + "Zukerberg :" + Zukerberg);

		int temp = Abhi;
		Abhi = Zukerberg;
		Zukerberg = temp;

		System.out.println("After swapping : "+ "Mine :" + Abhi + "Zukerberg :" + Zukerberg);
	}
	
	@Test
	public void withoutThirdVariable() {
		int a = 10;
		int b =20;
		System.out.println("Before swapping : "+ "a :" + a + "b :" + b);
		a = a-b;
		b = a+b;
		a = b-a;
		System.out.println("After swapping : "+ "a :" + a + "b :" + b);
	}
}
