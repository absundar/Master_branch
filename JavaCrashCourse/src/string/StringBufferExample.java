package string;

public class StringBufferExample {

	public static void main(String[] args) {
System.out.println("String is IMMUTABLE");
String name = "Abhi";
System.out.println("The Appended name "+ name.concat("Naya"));
System.out.println("The original name is "+ name);

System.out.println("String is MUTABLE");
StringBuffer name1= new StringBuffer("Abhi");
System.out.println("The Appended name "+ name1.append("Naya"));
System.out.println("The original name is "+ name1);  //it will take the appended one

System.out.println(name1.charAt(0));
System.out.println(name1.isEmpty());
System.out.println(name1.lastIndexOf(name));
System.out.println(name1.length());
System.out.println(name1.reverse());

	}

}
