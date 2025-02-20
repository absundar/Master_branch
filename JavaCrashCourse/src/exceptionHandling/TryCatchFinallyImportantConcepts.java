package exceptionHandling;

public class TryCatchFinallyImportantConcepts {
public static int dummy() {
	return 3;
	
}
//	public static void main(String[] args) {
//try {
//	System.out.println("inside try block");
//}catch(Exception e) {
//	System.out.println("inside catch block");
//}finally {
//	System.out.println("inside finally block");  
//	
	//finally and try will execute even if there is no exception
	
	public static void main(String[] args) {
//try {
//	System.out.println("inside try block");
//	throw new Exception();
//}catch(Exception e) {
//	System.out.println("inside catch block");
//}finally {
//	System.out.println("inside finally block");  
//	//finally is not a mandatory one
//}
	try {
		System.out.println("inside try block");
		System.out.println("test"+ TryCatchFinallyImportantConcepts.dummy());
		System.out.println("continue after exception");
		}catch(Exception e) {
		System.out.println("inside catch block");
	}finally {
		System.out.println("inside finally block");  
	}

}
}
