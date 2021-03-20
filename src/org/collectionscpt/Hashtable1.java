package org.collectionscpt;


import java.util.Hashtable;
import java.util.Map;

public class Hashtable1 {

	public static void main(String[] args) {
		
		Map<Integer,String> m = new Hashtable<>();
		m.put(80, "Welcome");
		m.put(20, "To");
		m.put(100, "Our");
		m.put(20, "Core");
		m.put(30, "Core");
		m.put(50, "Java");
		m.put(1200, "Class");
		
		System.out.println(m);
		

	}

}
