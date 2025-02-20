package practice;

public class AscendingSort {

	public static void main(String[] args) {
int a[] = {2,1,5,7,21,52,62};
/*int i = 0, j =0;
int temp = 0;
if(a[i]>a[j]) {
a[i]= temp;
a[i]=a[j];
a[j]=temp;
System.out.println("sorted array" + a[]);*/

int n = a.length;
int temp;
for(int i=0; i<n; i++) {
	for(int j=0; j<n-i-1; j++) {
		if(a[j]>a[j+1]) {
			temp=a[j];
			a[j]=a[j+1];
			a[j+1]=temp;
			
		}
	}
}
System.out.println("Sorted array :");
for(int i =0;i<n;i++) {
	System.out.println(a[i] + "");
}

	}

}