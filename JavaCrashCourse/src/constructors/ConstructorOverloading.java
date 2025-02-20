package constructors;

public class ConstructorOverloading {
String draw;

	ConstructorOverloading(){
		System.out.println("draw obj is created");
	}
	ConstructorOverloading(String toDraw){
		System.out.println("drawing "+ toDraw);
	}
	public static void main(String[] args) {
		ConstructorOverloading col= new ConstructorOverloading();
		ConstructorOverloading col1 =new ConstructorOverloading("square");
	}

}
