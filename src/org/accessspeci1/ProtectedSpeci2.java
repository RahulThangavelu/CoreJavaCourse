package org.accessspeci1;

public class ProtectedSpeci2 extends ProtectedSpeci1 {

	public static void main(String[] args) {
		
		//by using object 
		ProtectedSpeci1 pr = new ProtectedSpeci1();
		pr.empDetails();
		
		//by using extends
		ProtectedSpeci2 pr2 = new ProtectedSpeci2();
		pr2.empDetails();
	}

}
