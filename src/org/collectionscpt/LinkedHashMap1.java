package org.collectionscpt;


import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMap1 {

	public static void main(String[] args) {
		
		Map<Integer,String> m = new LinkedHashMap<>();
		m.put(10, "Welcome");
		m.put(20, "To");
		m.put(30, "Our");
		m.put(20, "Core");
		m.put(40, "Core");
		m.put(50, "Java");
		m.put(60, "Class");
		
		System.out.println(m);
		
		int sz = m.size();
		System.out.println(sz);
		
		String s = m.get(50);
		System.out.println(s);
		
		Set<Integer> ks = m.keySet();
        System.out.println(ks);
        
        Collection<String> vl = m.values();
        System.out.println(vl);
        
        boolean ck = m.containsKey(40);
        System.out.println(ck);
        
        boolean cv = m.containsValue("Class");
        System.out.println(cv);
        
        Set<Entry<Integer, String>> es = m.entrySet();
        
        for(Entry<Integer, String> x:es) {
        	System.out.println(x);
        	System.out.println(x.getKey());
        	System.out.println(x.getValue());
        }
	}

}
