package array;

import java.util.ArrayList;
import java.util.List;

public class ArrayListWithoutGenerics {

	public static void main(String[] args) {
List al = new ArrayList();  //should not use without generics that is<String>
al.add(1);
al.add("String");
System.out.println(al);
	}

}
