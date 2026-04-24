package javaPrograms;

public class ReverseString {

	public static void main(String[] args) {
String s = "abhi";
StringBuilder sb = new StringBuilder(s);
sb.reverse();
System.out.println("The reversed string is : " + sb.toString());
	}

}
