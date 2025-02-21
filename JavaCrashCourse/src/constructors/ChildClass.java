package constructors;

public class ChildClass extends ParentClass{

	public ChildClass() {
		// here there is an invisible keyword as super
		System.out.println("child constructor");
	}
	public static void main(String[] args) {
		ChildClass cc= new ChildClass();
	}

}
