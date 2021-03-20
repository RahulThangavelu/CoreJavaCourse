package org.collectionscpt;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		@SuppressWarnings("rawtypes")
		List al = new ArrayList();
		
		al.add(10);
		al.add("Rahul");
		al.add('R');
		al.add(true);
		al.add(405236l);
		al.add(50.001245f);
		al.add(12.3526);
		
		System.out.println(al);
		
	}

}
