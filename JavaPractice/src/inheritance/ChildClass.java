package inheritance;

public class ChildClass extends BaseClass {  //inheritance extends base class

	public static void main(String[] args) {
//		ChildClass obj1 = new ChildClass(); //create object for child class
//		obj1.chess();
//		obj1.cricket();
//		obj1.hockey();
//		obj1.football();
		
//		
//		BaseClass obj1 = new BaseClass();  //with base class, methods present in base class are only coming
//		obj1.football();
//		obj1.hockey();
		
		//ChildClass obj1= new BaseClass();  //not possible throwing error
		
		BaseClass obj1= new ChildClass();
		obj1.football();
		obj1.hockey();
		
	}
public static void chess() {
	System.out.println("chess is in child class");
}
public static void cricket() {
	System.out.println("cricket is in child class");
}
}
