package org.collectionscpt;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSet1 {

	public static void main(String[] args) {
		
		Set<Integer> hs = new LinkedHashSet<>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(20);
		hs.add(40);
		hs.add(50);
		
		System.out.println(hs);
		
		for(Integer x:hs) {
			System.out.println(x);
		}
		
		
		
	}

}
