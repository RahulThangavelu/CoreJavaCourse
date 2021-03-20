package org.exceptioncpt;

import java.util.LinkedList;
import java.util.List;

public class IndexOutOfBoundException {

	public static void main(String[] args) {
		
		List<Integer> li = new LinkedList<>();
		li.add(10);
		li.add(20);
		li.add(30);
		System.out.println(li);
		System.out.println(li.get(1));
		System.out.println(li.get(5));
		
	}

}
