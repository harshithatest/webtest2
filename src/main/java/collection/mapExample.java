package collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class mapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Map<String, Integer> map=new HashMap<>();
		map.put("raju", 5);
		map.put("mahi",3);
		Map<String, Integer> map1=new LinkedHashMap<>();
		map1.put("ravi", null);*/
	//	map1.putAll(map);
		Map<String, Integer> map2=new TreeMap<>();
		map2.put(" sds", 1);
		map2.put("omkar", null);
	//	map2.putAll(map1);
		for(Map.Entry<String, Integer> m: map2.entrySet()){
			System.out.println(m.getKey() + m.getValue());
		}
	}

}
