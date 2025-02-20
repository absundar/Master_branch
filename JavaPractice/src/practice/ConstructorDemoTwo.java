package practice;

public class ConstructorDemoTwo {
	int result;

	public static void main(String[] args) {
		ConstructorDemoTwo obj1= new ConstructorDemoTwo(6576);
		obj1.ConstructorDemo();
	}
public ConstructorDemoTwo(int marks) //initialize 
{
	result = marks;
}
public void ConstructorDemo() {
	System.out.println("final marks "+ result);

}
}
