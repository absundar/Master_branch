package abstraction;

public abstract class Benz extends Car{
//@Override
//public void engine() {
//	System.out.println("Benz engine");
//}
//@Override
//public void vault() {
//	System.out.println("Benz vault");
//}
	public abstract void vault();
	public void employee() {
		System.out.println("emp");
	}
	public void employee1() {
		System.out.println("emp1");
	}
	
	public static void main(String[] args) {
		//Car car = new Benz();  //abstract class so cannot be created
		//employee emp= new employee();  //object cannot be created even if there is one abstract class
		//car.engine();
		//car.vault();
	}

}
