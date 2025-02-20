package DB.PraticePrograms;

import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {
int x;
System.out.println("Enter the number");
Scanner sc = new Scanner(System.in);
x = sc.nextInt();
if(x%2==0) {
	System.out.println("Entered the number is even");
}
else {
	System.out.println("Entered the number is odd");
}
	}

}
