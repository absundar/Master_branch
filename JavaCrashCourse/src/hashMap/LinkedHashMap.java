package hashMap;

import java.util.HashMap;

public class LinkedHashMap {

	public static void main(String[] args) {
//LinkedHashMap<String, String> heros = new LinkedHashMap<String, String>();
		java.util.LinkedHashMap<String, String> heros = new java.util.LinkedHashMap<String, String>();
heros.put("Abhi", "Engineer");
heros.put("Leel", "HM");
heros.put("Ragav", "CA");
System.out.println(heros);

HashMap<String, String> myheros = new HashMap<String, String>();
myheros.put("Abhi", "Engineer");
myheros.put("Leel", "HM");
myheros.put("Ragav", "CA");
System.out.println(myheros);
	}

}
