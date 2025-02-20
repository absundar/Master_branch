package exceptionHandling;

public class SingleTryCatchBlock {

	public static void main(String[] args) {
try {
	int number1= 0;
	int number2=3;
	int result= number2/number1;
	System.out.println(result);
}catch(Exception e) {
	e.printStackTrace();
	System.out.println("drink lemon juice and dont divide a number by zero");
}
	}

}
