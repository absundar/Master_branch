package hashSet;

import java.util.HashSet;

public class HashSetExampleOne {

	public void hashSetExample() {
		HashSet<String> hashSet= new HashSet<String>();
		hashSet.add("A");
		hashSet.add(null);
		hashSet.add("B");
		hashSet.add("H");
		hashSet.add("I");
		hashSet.add("I");
		System.out.println("the has list"+ hashSet);
hashSet.remove(null);
System.out.println("the has list"+ hashSet);

System.out.println(hashSet.contains("A"));
}
	public static void main(String[] args) {
		HashSetExampleOne hse= new HashSetExampleOne();
		hse.hashSetExample();
	}

}
