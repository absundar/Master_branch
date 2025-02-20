package polymorphism;

public class PassParameters {

	public static void main(String[] args) {
		PassParameters obj1= new PassParameters();
		int a = 423;
		int b= 987;
//		int a, b;
//		double x,y;
		double x= 14.534;
		double y= 3412.53;
		obj1.sum(9898, 878);
		obj1.sub(448, 338);
	}
public int sum(int a, int b) {
	int c= a+b;
	System.out.println("the sum is "+ c);
	return c;
}
public double sub(double x, double y) {
	double z= x-y;
	System.out.println("the sub is " +z);
	return z;
}
}
