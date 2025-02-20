package finalKeyword;

public class FinalVariable {

	public void show() {
		final int marks= 90;
		//marks = 95;
		System.out.println("the mark is "+ marks);
	}
	public static void main(String[] args) {
		FinalVariable obj1= new FinalVariable();
		obj1.show();
	}

}
