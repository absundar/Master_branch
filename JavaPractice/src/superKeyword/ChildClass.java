package superKeyword;

public class ChildClass extends BaseClass {
int rate = 12;
	public static void main(String[] args) {
		ChildClass obj1= new ChildClass();
		obj1.showMePvtBankInterestRate();
	}
	
	public void showMeRate() //just adding the method from base class
	{
		//System.out.println("the interest rate is " +rate);  
		System.out.println("im in child class");
	}
public void showMePvtBankInterestRate() {
	super.showMeRate();     //scenario 2
	System.out.println("the pvt bank interest rate is "+super.rate); //scenario 1
	                       // super refers the base class value and prints it
}
}
