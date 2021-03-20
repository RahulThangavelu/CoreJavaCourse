package org.collectionscpt;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Generics {

	public static void main(String[] args) {
		
		
		List<Integer> li = new LinkedList<>();
		
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(10);
		li.add(40);
		li.add(50);
		
		System.out.println(li);
		
		
		
		int sz = li.size();
        System.out.println(sz);
        
        for(int i=0;i<sz;i++) {
			System.out.println(li.get(i));
		}
        
        for(int x:li) {
        	System.out.println(x);
        }       
        
        
        
        Integer in = li.get(4);
        System.out.println(in);
        
        li.add(3, 100);
        System.out.println(li);
        
        li.remove(4);
        System.out.println(li);
        
        li.set(3, 200);
        System.out.println(li);
        
        int ino = li.indexOf(40);
        System.out.println(ino);
        
        int lino = li.lastIndexOf(10);
        System.out.println(lino);
        
        boolean ct = li.contains(30);
        System.out.println(ct);
        
        System.out.println("Linked list value is "+li);
        
        
        ArrayList<Integer> al = new ArrayList<>();
        al.addAll(li);
        System.out.println("Array List value is "+al);
        al.add(60);
        al.add(70);
        al.add(80);
        System.out.println("array list value is "+al);
        
        al.retainAll(li);
        System.out.println("common value is "+al);
        
        al.add(60);
        al.add(70);
        System.out.println(al);
        al.removeAll(li);
        System.out.println("uncommon value is "+al);
        
        
        
        
        
        
        
        
        
        
        
        
	}

}
