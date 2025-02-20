package superKeyword;

public class SubClass extends ParentClass {

public SubClass() {
	System.out.println("im in subclass ");
	}
public SubClass(String name) {
	super(name);        //only for parameterized constructor
	System.out.println("im in subclass "+name);
}
public static void main(String[] args)
{
	SubClass obj1 = new SubClass("Abhinaya");

}
}
