package finalKeyword;

public class FinalVariable1 {
final String PANCARD;
	
	// final can be intialized with constructor class
	public FinalVariable1(String pancard) {
		PANCARD= pancard;
	}
public void show() {
	System.out.println("the pancard detail is "+PANCARD);
}
	public static void main(String[] args) {
		FinalVariable1 obj1= new FinalVariable1("ABA");
		obj1.show();
	}

}
