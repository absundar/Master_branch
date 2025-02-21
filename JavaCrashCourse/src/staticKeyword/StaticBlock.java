package staticKeyword;

public class StaticBlock {
static{
	System.out.println("Static block 1");
}
static{
	System.out.println("Static block 2");
}

	public static void main(String[] args) {
System.out.println("Main method");   //static blocks get executed first to initialize the static variables
	}

}
