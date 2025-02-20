package exceptionHandling;

public class OneTryMultiCatch {

	public static void main(String[] args) {
		try {
int number1= 2;
int number2= 3;
int result=number2/number1;
System.out.println(result);
	}
catch(ArithmeticException e) {
	System.out.println("Arithmetic Exception");
}
catch(NullPointerException e) {
	System.out.println("Nullpointer Exception");

}
catch(Exception e) {
	System.out.println("if not able to handle Exception, then i will take care");

}
	}
}


//if no exception catch will not do anything
//arithmetic and null pointer exceptions are child of exception