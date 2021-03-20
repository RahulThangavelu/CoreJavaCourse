package org.collectionscpt;

import java.util.Set;
import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
		Set<Integer> hs = new TreeSet<>();
		hs.add(80);
		hs.add(20);
		hs.add(10);
		hs.add(20);
		hs.add(40);
		hs.add(50);
		
		System.out.println(hs);
		
		Set<Character> hs1 = new TreeSet<>();
		hs1.add('A');
		hs1.add(' ');
		hs1.add('a');
		hs1.add('B');
		hs1.add('%');
		hs1.add('9');
		
		System.out.println(hs1);
		
		

	}

}
