package practice;

public class LongestPrefix {

	public static void main(String[] args) {
String a[] = {"find", "fruit", "fame", "free", "fare", "flight", "fee"};
if(a==null || a.length==0) {
	System.out.println("The longest prefix is : ");
}
String result = a[0];
for(int i =0; i<a[0].length(); i++) {
	char c = a[0].charAt(i);
	for(int j = 0; j<a.length;j++) {
		if(i>=a[j].length() || a[j].charAt(i)!=c) {
			result = a[0].substring(0, i);
			System.out.println("The longest prefix : " + result);
			return;
		}
	}
}
System.out.println("The longest prefix is : " + a[0]);
	}

}