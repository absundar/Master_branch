package javaNewPractice;

import java.util.Scanner;

public class JavaScannerClassPgm {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int a;
String b;
float f;
System.out.println("Enter the String");
b=sc.nextLine();
System.out.println("You entered a string "+ b);

System.out.println("Enter the float");
f=sc.nextFloat();
System.out.println("You entered a float "+ f);

System.out.println("Enter the integer");
a= sc.nextInt();
System.out.println("You entered an integer "+ a);
	}

}
