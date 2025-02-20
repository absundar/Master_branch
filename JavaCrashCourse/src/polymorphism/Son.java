package polymorphism;

public class Son extends Parent {
@Override   //since its there in parent class but different in child class
	public void marriage() {
		System.out.println("My marriage my rules");
	}
	public static void main(String[] args) {
		
		Parent object1 = new Son(); //dynamic or run time polymorphism // parent class reference child class
		object1.properties();
		object1.marriage();
	}

}
