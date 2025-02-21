
public class Sample {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		int size = arr.length;

		// Iterate over all elements
		for (int i = 0; i < size; i++) {
		    System.out.println("first set : " + arr[i]);
		}

		// Iterate up to the second-to-last element
		for (int i = 0; i < size - 1; i++) {
		    System.out.println("second set : " + arr[i]);
		}
	}

}
