package thisKeyword;

public class MyDrivers {

	public MyDrivers() {
		this("JDBC");
		System.out.println("Loading my drivers");
	}
	public MyDrivers(String name) {
		this(10);
		System.out.println("Loading my drivers the name is " +name);
	}
	public MyDrivers(int count) {
		System.out.println("Loading my drivers the count is " +count);
	}
	public void display() {
		System.out.println("im in display method");
	}
	public static void main(String[] args) {
		MyDrivers obj1= new MyDrivers();
		obj1.display();
	}

}
