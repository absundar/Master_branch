package DB.PraticePrograms;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
int c, n, fact =1;
System.out.println("Enter the number to find the factorial");
Scanner sc = new Scanner(System.in);
n =sc.nextInt();
if(n<0) {
	System.out.println("Entered non negative number is not allowed");
}else {
	for(c=1;c<=n;c++) {
		fact = fact*c;
		System.out.println("Factorial of "+n+" is = "+fact);
	}
}
	}

}
