package DB.PraticePrograms;

import java.util.Scanner;

public class GreatestOf3Numbers {

	public static void main(String[] args) {
int x,y,z;
System.out.println("Enter x, y and z");
Scanner sc = new Scanner(System.in);
x = sc.nextInt();
y = sc.nextInt();
z = sc.nextInt();
if(x > y && x > z) {
	System.out.println("X is the greatest number");
}
else if(y > x && y>z) {
	System.out.println("y is the greatest number");
}
else if(z > x && z > y) {
	System.out.println("Z is the greatest number");
}
else {
	System.out.println("All the numbers are distinct");
}

	}

}
