package tree;

import java.util.TreeSet;

public class TreeSetExample {

	public void treeSetExample() {
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		treeSet.add(1);
		treeSet.add(2);
		treeSet.add(3);
		treeSet.add(4);
		treeSet.add(19);
		treeSet.add(43);
		System.out.println("the tree set is "+ treeSet);
		treeSet.headSet(3);
		System.out.println("the head set is "+treeSet.headSet(3));//below number expect that number
		System.out.println("the tail set is " +treeSet.tailSet(9));//above numbers including that number
		System.out.println("the ceiling is " +treeSet.ceiling(6));
		System.out.println("the poll first is " +treeSet.pollFirst());
		System.out.println("the poll last is " +treeSet.pollLast());
		System.out.println("the comparator is " +treeSet.comparator());
		System.out.println("the highest value next to the given number is " +treeSet.higher(5));
		System.out.println("the lowest value before to the given number is " +treeSet.lower(5));
		System.out.println("the descending set " +treeSet.descendingSet());
		System.out.println("the descending set " +treeSet.descendingIterator().next());


	}
	public static void main(String[] args) {
		TreeSetExample tse= new TreeSetExample();
		tse.treeSetExample();
	}
}
