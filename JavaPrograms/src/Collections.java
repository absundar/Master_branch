import java.util.ArrayList;
import java.util.LinkedList;

public class Collections {

	public static void main(String[] args) {
		int[] arr = {2,5,2677,157,13,21,6,1,6,276};
ArrayList<Integer> al = new ArrayList<Integer>();
int a =al.size();
for(int num : arr) {
	al.add(num);
}
LinkedList<Integer> li = new LinkedList<Integer>();
li.push(29);
System.out.println("After adding");
for(int i=0; i<a;i++) {
System.out.println(al.get(i) + "");
	}
	}
}
