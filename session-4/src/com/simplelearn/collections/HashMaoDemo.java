package com.simplelearn.collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
public class HashMaoDemo {
	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<>();
		map.put(1, "sash");
		map.put(6, "swet");
		
		System.out.println(map);
		System.out.println("contains 6" +map.containsKey(6));
		System.out.println("Get value of 1" +map.get(1));
		
		Iterator<Map.Entry<Integer, String>> it =map.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<Integer, String> entry=it.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}

}
