package string;

public class StringExamples {

	public static void main(String[] args) {
		String name= "AbhinayaSundar";   //string literal
		int i =3;
System.out.println(name.charAt(2));
System.out.println(name.contentEquals("Abhi"));
System.out.println("test1"+name.compareTo("LeelaSundar")); 
System.out.println("test2" +name.compareToIgnoreCase("abhinayasundar"));
                                   //The return value is 0 if str1 is equal to str2.
                                   //The return value is a positive integer if str1 is greater than str2.
                                   //The return value is a negative integer if str1 is less than str2.
System.out.println("test2" +name.compareToIgnoreCase("abhinayasundar"));
System.out.println("ABhi" +name.contains("A"));
System.out.println(name.contentEquals(name));
System.out.println(name.contentEquals("Leela"));
System.out.println(name.endsWith("r"));
System.out.println(name.equalsIgnoreCase("abhinayasundar"));
System.out.println("hi" +name.indexOf("A"));  
System.out.println(name.isBlank());
System.out.println(name.isEmpty());
System.out.println("test" +name.lastIndexOf("r"));  
System.out.println(name.length());
System.out.println(name.replace("a", "l"));
System.out.println("Leela" +name.startsWith("A"));
System.out.println(name.toCharArray());
System.out.println(name.toLowerCase());
System.out.println(name.toUpperCase());
System.out.println(name.trim());
System.out.println(name.join("-", "Abhi", "Leela", "Ragav"));
System.out.println(name.valueOf(name));  

	}
}
