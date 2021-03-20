package org.oopscpt;

public class InheritanceMultilvl3 extends InheritanceMultilvl2{
	
	public void empPhone() {
	System.out.println("9876543210");

	}
	
	public static void main(String[] args) {
		InheritanceMultilvl3 mi = new InheritanceMultilvl3();
		mi.empId();
		mi.empName();
		mi.empPhone();
	}

}
