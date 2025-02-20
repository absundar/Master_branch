package practice;

public class BoxingAutoBoxing {

	public static void main(String[] args) {
		
		//Autoboxing- with implicitly doing anything its changed
int a= 100; //primitive data type
Integer b =a;  //where b is an object, converting to wrapper class
System.out.println(b);

//boxing
int x= 90;
Integer y = Integer.valueOf(x);
System.out.println(x);

//unboxing
Integer result = 100;
int newResult= result.intValue();
System.out.println(newResult);

//auto-unboxing
Integer marks= 40;
int newMarks= marks;
System.out.println(newMarks);
	}

}
