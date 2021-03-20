package org.collectionscpt;

import java.util.Vector;

public class VectorList1 {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		@SuppressWarnings("rawtypes")
		Vector al = new Vector();
		
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
