package interfaceDemo;

public class AdvanceCalci1 implements Calci {

	public static void main(String[] args) {
		AdvanceCalci1 obj1= new AdvanceCalci1();
		obj1.add();
		obj1.cos();
		obj1.sin();
		obj1.sub();
		obj1.sec();
		obj1.tan();
	//	AdvanceCalci1 obj2= new Calci(); // not possible to create for interface
//		Calci obj3= new AdvanceCalci1(); //possible to use interface as reference but wont get methods from advancecalci
//		obj3.add();
//		obj3.sub();
		//Calci obj4= new Calci();   // not possible in advancecalci
		//AdvanceCalci1 obj5 = new AdvanceCalci(); // not possible

	//	AdvanceCalci obj6= new AdvanceCalci1();  // not possible
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
	public void tan() {
		System.out.println("tan in advancecalci1");

	}
	public void sec() {
		System.out.println("sec in advancecalci1");

	}
}
