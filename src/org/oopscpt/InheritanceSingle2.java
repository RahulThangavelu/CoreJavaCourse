package org.oopscpt;

public class InheritanceSingle2 extends InheritanceSingle1{
	
	public void empName() {
		System.out.println("employee name is rahul");

	}
	
	public static void main(String[] args) {
		
		InheritanceSingle2 si = new InheritanceSingle2();
		si.empId();
		si.empName();
	}

}
