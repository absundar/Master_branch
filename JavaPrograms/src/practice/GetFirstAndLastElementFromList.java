package practice;

import java.util.ArrayList;
import java.util.List;

public class GetFirstAndLastElementFromList {

	public static void main(String[] args) {
		List<Integer> li = new ArrayList();
		li.add(2);
		li.add(23);
		li.add(23512);
		li.add(89798);
	int a=	li.getFirst();
	int b=	li.getLast();
	System.out.println(a);
	System.out.println(b);
	}

}
