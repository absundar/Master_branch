package practice;

public class ClassMethodsObjects {
int x = 23432;
int y = 34243;

	public static void main(String[] args) {
		ClassMethodsObjects obj1= new ClassMethodsObjects(); // object creation
		obj1.sum(); //calling the method
		System.out.println("the value of x is "+ obj1.x);
		System.out.println("the value of y is "+ obj1.y);
	}
public static void sum() {
	int x = 23432;
	int y = 34243;
	int z = x+y;
	System.out.println("the sum is "+z);
}
}
