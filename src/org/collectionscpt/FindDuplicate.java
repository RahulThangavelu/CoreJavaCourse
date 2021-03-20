package org.collectionscpt;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class FindDuplicate {

	public static void main(String[] args) {
		
		List<Integer> li = new LinkedList<>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(10);
		li.add(40);
		li.add(50);
		li.add(30);
		System.out.println(li);
		
		int sz1 = li.size();
		System.out.println(sz1);
		
		Set<Integer> si = new LinkedHashSet<>();
		si.addAll(li);
		System.out.println(si);
		
		int sz2 = si.size();
        System.out.println(sz2);
        
        int duplicate = sz1 - sz2;
        System.out.println("duplicate value count is "+duplicate);
        
	}

}
