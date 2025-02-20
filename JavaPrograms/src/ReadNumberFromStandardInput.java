import java.util.Scanner;

public class ReadNumberFromStandardInput {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the int number");
int a = sc.nextInt();
System.out.println("Enter the double number");
double b = sc.nextDouble();
System.out.println("Enter the float number");
float c = sc.nextFloat();
System.out.println("Enter the long number ");
long d = sc.nextLong();
System.out.println("Enter the short number");
short e = sc.nextShort();
System.out.println("Enter the string");
String f = sc.next();
sc.close();
	}

}
