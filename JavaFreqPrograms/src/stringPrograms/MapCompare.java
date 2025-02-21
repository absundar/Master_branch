package stringPrograms;

import java.util.HashMap;
import java.util.Map;

public class MapCompare {

	public static void main(String[] args) {
Map<Character, String> map1 = new HashMap<Character, String>();
Map<Character, String> map2 = new HashMap<Character, String>();
map1.put('a', "abhi");
map2.put('b', "abhi");
if(map1.containsKey(map2)) {
	System.out.println("The keys are matching :");
}
else {
	System.out.println("The keys are not matching");
}
if(map1.containsValue(map2)) {
	System.out.println("The values are matching");
}
else {
	System.out.println("The values are not matching");
}
	}

}
