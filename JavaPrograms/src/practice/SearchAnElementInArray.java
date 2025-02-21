package practice;

import java.util.Scanner;

public class SearchAnElementInArray {

	public static void main(String[] args) {
int[] a= {2,5,79,24,83,96,27};
int size= a.length;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number to search");
int element = sc.nextInt();
boolean found = false;
for(int i=0; i<size;i++) {
	if(a[i]==element) {
		System.out.println("The element is present");
		found = true;
		break;
	}
}
	if(!found) {
		System.out.println("The element is not present");
	
}
sc.close();
	}

}
