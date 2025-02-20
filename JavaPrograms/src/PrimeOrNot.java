import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number :");
int a = sc.nextInt();
if(a%a==0 && a%1==0) {
	System.out.println("Prime");
}
else {
	System.out.println("not prime");
	}
sc.close();
}
}