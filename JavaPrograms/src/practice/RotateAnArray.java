/*package practice;

public class RotateAnArray {

	public static void main(String[] args) {
int a[]= {2,4,6,8,10};
int size= a.length;
int move= 3;
int[] rotatedArray= new int [size];

for(int i=0;i<size;i++) {
rotatedArray[(i+move)%size]=a[i];  //moves the element to the left
}
System.out.println("Rotated array : ");
for(int i=0;i<size;i++) {
	System.out.println(rotatedArray[i]);
}
	}

}*/
package practice;

public class RotateAnArray {

    public static void main(String[] args) {
        int a[] = {2, 4, 6, 8, 10};
        int size = a.length;
        int move = 3;
        int[] rotatedArray = new int[size];

        for (int i = 0; i < size; i++) {
            rotatedArray[(i - move  +size) % size] = a[i]; //moves the element to the right
        }

        System.out.println("Rotated array:");
        for (int i = 0; i < size; i++) {
            System.out.println(rotatedArray[i]);
        }
    }
}