package array;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListExample {

	public void arrayListExample() {
	List <String> arrayList = new ArrayList <String>();
	arrayList.add("Benz");
	arrayList.add("bmw");
	arrayList.add("hero");
	arrayList.add("maruti");
	System.out.println(arrayList);
	System.out.println(arrayList.get(0));
	System.out.println(arrayList.indexOf("hero"));
	System.out.println(arrayList.lastIndexOf("Benz"));
	
	List<String> anotherList= new ArrayList<String>(); 
	anotherList.addAll(arrayList);    //to add one list to another
	System.out.println(anotherList);
	//anotherList.clear();
	anotherList.remove(0);
	System.out.println(anotherList);
	anotherList.remove("bmw");
	System.out.println(anotherList);
	anotherList.add(null);
	System.out.println(anotherList);
anotherList.set(0, "i10");
System.out.println(anotherList);
System.out.println(anotherList.isEmpty());
for(int i=1;i<anotherList.size();i++)
{
System.out.println("array list" + anotherList.get(i));
}
for(String string : anotherList) {
	System.out.println("using for each "+ string);
}
	ListIterator<String> iterator =anotherList.listIterator();
while(iterator.hasNext()) {
	System.out.println(iterator.next());
}
while(iterator.hasPrevious()) {
	System.out.println(iterator.previous());
}
Iterator<String> iterator1 = anotherList.iterator();
while(iterator1.hasNext()) {
	System.out.println(iterator1.next());
}
for(String string: anotherList) {
	System.out.println("using for each "+ string);  
	anotherList.add("TEST");  // throws concurrent modification exception as already for loop is happening
}
	}
	public static void main(String[] args) {
		ArrayListExample ale= new ArrayListExample();
		ale.arrayListExample();
	}

}
