package DB.PraticePrograms;

import java.util.Scanner;

public class Swap2NumbersWithout3Number {

	public static void main(String[] args) {
int a,b;
System.out.println("Enter a and b");
Scanner in = new Scanner(System.in);
a = in.nextInt();
b = in.nextInt();
System.out.println("Before Swapping\na = "+a+"\nb = "+b); 
a = a + b;
b= a- b;
a=a-b;
System.out.println("Before Swapping\na = "+a+"\nb = "+b); 

	}

}
