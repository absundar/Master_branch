package staticKeyword;

public class StaticVariable {
static int account_Balance=0;
String depositedBy;
	public static void main(String[] args) {
		StaticVariable object1 = new StaticVariable();
		object1.account_Balance=1000;
		object1.depositedBy= "Abhi";
		
		StaticVariable object2 = new StaticVariable();
		object2.account_Balance=2000;
		object2.depositedBy="leela";
		
		System.out.println("object1 integer:"+ object1.account_Balance);
		System.out.println("object1 String:"+ object1.depositedBy);
		System.out.println("object2 integer:"+ object2.account_Balance);
		System.out.println("object2 String:"+ object2.depositedBy);
	}

}
