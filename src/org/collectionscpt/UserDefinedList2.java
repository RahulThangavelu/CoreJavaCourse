package org.collectionscpt;

import java.util.LinkedList;
import java.util.List;

public class UserDefinedList2 {

	public static void main(String[] args) {
		
		
		List<UserDefinedList1> li = new LinkedList<>();
		
		UserDefinedList1 u = new UserDefinedList1();
		u.setId(101);
		u.setName("Rahul");
		u.setPhone(987654321);
		
		UserDefinedList1 u1 = new UserDefinedList1();
		u1.setId(102);
		u1.setName("Thangavel");
		u1.setPhone(987654321);
		
		li.add(u);
		li.add(u1);
		
		
		int sz = li.size();
		System.out.println(sz);
		
		System.out.println("emp 1 id is "+li.get(0).getId());
		System.out.println("emp 1 name is "+li.get(0).getName());
		System.out.println("emp 1 phone is "+li.get(0).getPhone());
		
		System.out.println("emp 2 id is "+li.get(1).getId());
		System.out.println("emp 2 name is "+li.get(1).getName());
		System.out.println("emp 2 phone is "+li.get(1).getPhone());
		
		
	}

}
