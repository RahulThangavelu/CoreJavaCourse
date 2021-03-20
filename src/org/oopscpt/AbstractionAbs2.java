package org.oopscpt;

public class AbstractionAbs2 extends AbstractionAbs1 {

	@Override
	public void empName() {
		System.out.println("emp name is rahul");
		
	}

	@Override
	public void empSalary() {
		System.out.println("emp salary is 60000");
		
	}
	
	public static void main(String[] args) {
		AbstractionAbs2 ab = new AbstractionAbs2();
		ab.empId();
		ab.empName();
		ab.empSalary();
	}
	
	

}
