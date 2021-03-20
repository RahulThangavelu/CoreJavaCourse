package org.collectionscpt;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap1 {

	public static void main(String[] args) {
		
		Map<Integer,String> m = new TreeMap<>();
		m.put(60, "Welcome");
		m.put(20, "To");
		m.put(30, "Our");
		m.put(20, "Core");
		m.put(40, "Core");
		m.put(50, "Java");
		m.put(10, "Class");
		
		System.out.println(m);
		

	}

}
