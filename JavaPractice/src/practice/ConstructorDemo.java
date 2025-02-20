package practice;

public class ConstructorDemo {

	public static void main(String[] args) {
		ConstructorDemo obj1= new ConstructorDemo();
		obj1.ConstructorDemoOne();
	}
public ConstructorDemo() {   //static method constructor can be called with same name
	                         // we can pass parameters in these methods by different datatypes and values with the same method name and execute
	System.out.println("constructor demo");
}
public void ConstructorDemoOne() {
	System.out.println("constructor demo one");  

}
}