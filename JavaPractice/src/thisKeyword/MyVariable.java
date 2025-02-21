package thisKeyword;

public class MyVariable {

	int x;
	int y;
	public MyVariable(int x, int y)
	{
	this.x=x;   // if this is not given it will take the default value of global variable which is zero
	this.y=y;
	}
	public void sum() {
		int sum = x+y;
		System.out.println("the result is "+ sum);
	}
	public static void main(String[] args) {
		MyVariable obj1 = new MyVariable(18, 40);
		obj1.sum();
	}

}
