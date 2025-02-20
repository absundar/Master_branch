package staticKeyword;

public class StaticMethods {

	public static void method() {
		System.out.println("static method");
		//nonStatic();  //Cannot make a static reference to the non-static method nonStatic() from the type StaticMethods
	}
	public void nonStatic() {
		method();  //but static inside non static method can be called but not vice versa
		System.out.println("static method");

	}
	public static void main(String[] args) {
		//StaticMethods sm= new StaticMethods();
		method();   //for static methods we dont need to create objects
		StaticMethods sm = new StaticMethods();
		sm.nonStatic();   // we can either change the non static method to static or create a object for it
	}

}
