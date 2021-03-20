package org.oopscpt;

public class AbstractionInt2 implements AbstractionInt1{

	@Override
	public void empId() {
		System.out.println("emp id is 101");
		
	}

	@Override
	public void empName() {
		System.out.println("emp name is rahul");
		
	}

	@Override
	public void empSalary() {
		System.out.println("emp salry is 60000");
		
	}
	
	public static void main(String[] args) {
		AbstractionInt2 in = new AbstractionInt2();
		in.empId();
		in.empName();
		in.empSalary();
	}

}
