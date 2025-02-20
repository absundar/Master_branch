package DB.PraticePrograms;

import java.util.Scanner;

public class Swap2NumbersUsing3 {

	public static void main(String[] args) {
int a;
int b;
int temp;
System.out.println("Enter x and y");
//System.out.println(a);
//System.out.println(b);
Scanner in = new Scanner(System.in);
a = in.nextInt();
b = in.nextInt();
System.out.println("Before Swapping\na = "+a+"\nb = "+b); 
temp=a;
a= b;
b= temp;
System.out.println("After Swapping\na = "+a+"\nb = "+b);
	}

}
