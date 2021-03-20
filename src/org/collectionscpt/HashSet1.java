package org.collectionscpt;

import java.util.HashSet;
import java.util.Set;

public class HashSet1 {

	public static void main(String[] args) {
		
		Set<Integer> hs = new HashSet<>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(20);
		hs.add(40);
		hs.add(50);
		
		System.out.println(hs);
		

	}

}
