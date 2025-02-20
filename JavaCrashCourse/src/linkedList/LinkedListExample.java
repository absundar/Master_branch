package linkedList;

import java.util.LinkedList;

public class LinkedListExample {
	public void linkedListOperationsExample() {
LinkedList<Integer> linkedList = new LinkedList<Integer>();
linkedList.add(2);
linkedList.add(3);
linkedList.add(4);
linkedList.add(4);
System.out.println("linked list "+ linkedList);
linkedList.addFirst(1);
System.out.println("linked list adding first "+ linkedList);
linkedList.addLast(5);
System.out.println("linked list adding last "+ linkedList);
System.out.println("linked list get first "+ linkedList.getFirst());
System.out.println("linked list get index "+ linkedList.get(0));
System.out.println("linked list remove first "+ linkedList.removeFirst());
System.out.println("linked list remove last "+ linkedList.removeLast());
for(int index=0; index<linkedList.size();index++) {
	System.out.println("linked list elements are "+ linkedList.get(index));
	
}
	}
public static void main(String[] args) {
	LinkedListExample lle = new LinkedListExample();
	lle.linkedListOperationsExample();
	}
// in stack push for add pop for remove
}
