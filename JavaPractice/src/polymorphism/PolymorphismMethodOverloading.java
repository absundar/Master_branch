package polymorphism;

public class PolymorphismMethodOverloading {

	public static void main(String[] args) {
		PolymorphismMethodOverloading obj1 = new PolymorphismMethodOverloading();
		int sum=obj1.sum(442, 433);
		double sum1 = obj1.sum(6757, 89798);
		obj1.sum(8787, 88990, 89889);
		obj1.sum(78687, 7657);
	}
public int sum(int a, int b) //method overloading 
{
	int sum= a+b;
	System.out.println("first sum " +sum);
	return b;
}
public int sum(int a, int b, int c) // same method with extra data
{
	int sum= a+b;
	System.out.println("second sum " +sum);
	return c;
}
public void sum(double b, int a)  //same method name with different datatype
{	
	double sum1= a+b;

	System.out.println("third sum " +sum1);
}
public void sum(int a, double b) //same method name in different order
{
	double sum1= a+b;

System.out.println("fourth sum " +sum1);	
}
}
