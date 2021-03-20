package org.accessmodi;

public class AbstractModi2 extends AbstractModi1 {

	@Override
	public void empName() {
		System.out.println("employee name is rahul");
		
	}
	
	public static void main(String[] args) {
		AbstractModi2 am = new AbstractModi2();
		am.empID();
		am.empName();
	}
	
	

}
