package practice;

import java.util.Arrays;

public class MergeTwoArrays {

	public static void main(String[] args) {
int a[] = {2,73,72,726,721};
int b[] = {7,83,268,246,900};
int size = a.length+b.length;
int merged[]= new int[size];
for(int i=0;i<a.length;i++) {
	merged[i]= a[i];
}
for(int j=0;j<b.length;j++) {
	merged[a.length+j]=b[j];
}
//int mergedArray = merged[i]+merged[a.length+j];
//int mergedArray =a[i]+b[j];
System.out.println(Arrays.toString(merged));
	}

}
