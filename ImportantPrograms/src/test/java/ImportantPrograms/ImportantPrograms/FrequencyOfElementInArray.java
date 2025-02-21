package ImportantPrograms.ImportantPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class FrequencyOfElementInArray {
	
@Test
	public void freq() {
int[] a= {2,55,26,77,256,2,66};
int size = a.length;
HashMap<Integer, Integer> hm = new HashMap<>();

for(int i=0;i<size;i++) {
	//if(a[i]==a[i+1]) {
		int num=a[i];
		//System.out.println("The frequent element is :" );

hm.put(num, hm.getOrDefault(num, 0)+1);
for(Map.Entry<Integer, Integer> entry : hm.entrySet()) {
	System.out.println("Element " + entry.getKey() + " occurs " + entry.getValue() + " times ");
	}
}
}
}


