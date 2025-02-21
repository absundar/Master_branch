package finalKeyword;

public class FinalMethodChild extends FinalMethodParent{
//	public final void name()    //cant override
//	{
//		System.out.println("My name is Abhinaya");
//	}
	public void address()
	{
		System.out.println("My city is chennai");
	}
	public void number()
	{
		System.out.println("My number is 90809987");
	}
	public static void main(String[] args) {
		FinalMethodChild obj1= new FinalMethodChild();
		obj1.name();
		obj1.address();
		obj1.number();
	}

}
