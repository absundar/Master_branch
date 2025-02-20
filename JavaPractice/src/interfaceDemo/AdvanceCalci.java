package interfaceDemo;

public class AdvanceCalci implements Calci {

	public static void main(String[] args) {
		AdvanceCalci obj1= new AdvanceCalci();
		obj1.add();
		obj1.cos();
		obj1.sin();
		obj1.sub();
	//	AdvanceCalci obj2= new Calci(); // not possible to create for interface
//		Calci obj3= new AdvanceCalci(); //possible to use interface as reference but wont get methods from advancecalci
//		obj3.add();
//		obj3.sub();
		//Calci obj4= new Calci();   // not possible in advancecalci


	}

	@Override
	public void add() {
		System.out.println("add in calci");
	}

	@Override
	public void sub() {
		System.out.println("sub in calci");

	}
	public void sin() {
		System.out.println("sin in advancecalci");

	}
	public void cos() {
		System.out.println("cos in advancecalci");

	}
}
