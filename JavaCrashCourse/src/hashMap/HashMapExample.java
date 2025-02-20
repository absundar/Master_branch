package hashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
//HashMap<Key, Value>
		HashMap<Integer, String> hashMap= new HashMap<Integer, String>();
		//to insert an element put method is used
		hashMap.put(1, "Abhi");
		hashMap.put(2, "leela");
		hashMap.put(3, "Ragav");
		System.out.println("family "+ hashMap);
	
		//to make a copy of the existing map
		Map<Integer, String> copyMap = new HashMap<Integer, String>();
		copyMap.putAll(copyMap);
		System.out.println("copy "+copyMap);
		
		System.out.println(copyMap.containsValue("Abhi"));
		System.out.println(hashMap.containsValue("Abhi"));
		System.out.println(copyMap.putIfAbsent(4, "XYZ"));
		System.out.println(hashMap.putIfAbsent(4, "XYZ"));
		System.out.println(hashMap.getOrDefault(1, "Abhi"));
		System.out.println(hashMap.getOrDefault(1, "Leela"));
		System.out.println(hashMap.get(3));
		System.out.println(hashMap.containsKey(2));
		System.out.println(hashMap.get(5));


	}

}
