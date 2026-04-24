package javaPractice;

public class ArrayProgram {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5};
		int length= arr.length;
		System.out.println("Length of the array is :" + length);
		for(int i=0;i>length;i--) {
			if(arr[i]> arr[i-1]) {
				System.out.println("The largest number is :" + arr[i]);
			}
		}
	}

}
