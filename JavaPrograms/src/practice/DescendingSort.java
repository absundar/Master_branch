package practice;

public class DescendingSort {

	public static void main(String[] args) {
int a[] = {1,5,2,6,76,2167,89};
int n= a.length;
int temp;
for(int i=0;i<n-1;i++) {
	for(int j=0;j<n-i-1;j++) {
		if(a[j]<a[j+1]) {
		temp =a[j+1];
		a[j+1]=a[j];
		a[j]=temp;
		}
	}
}
System.out.println("Descending array");
for(int i=0; i<n;i++) {
	System.out.println(a[i] + "");
}
	}

}
