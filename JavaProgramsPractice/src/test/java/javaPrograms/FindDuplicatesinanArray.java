package javaPrograms;

import java.util.HashSet;

import org.testng.annotations.Test;

public class FindDuplicatesinanArray {
@Test
public void usingForLoop() {
	String given[]= {"pothys", "kumaranm", "rmkv", "chennaisilks"};
	boolean flag= false;
	for(int i=0;i<given.length;i++) {
		for(int j=i+1; j<given.length;j++) {
			if(given[i]==given[j]) {
				System.out.println("Found the duplicates : "+ given[i]);
				flag =true;
			}
		}
	}
	if(flag==false) {
		System.out.println("No duplicate element is present");
	}
}
@Test
public void usingHashSet() {
	String given[]= {"pothys", "kumaranm", "rmkv", "chennaisilks", "pothys"};
HashSet<String> shops = new HashSet<String>();
System.out.println(shops.add("pothys"));
System.out.println(shops.add("rmkv"));
System.out.println(shops.add("kumaranm"));
System.out.println(shops.add("kumaranm"));
System.out.println(shops.add("pothys"));

boolean flag = false;
for(String s:given) {
	if(shops.add(s)==false) {
		System.out.println("Found duplicates : " +s);
		flag=true;
	}
}
if(flag==false) {
	System.out.println("No duplicate element is present");
}
}
}
