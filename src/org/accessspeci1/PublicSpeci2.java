package org.accessspeci1;

public class PublicSpeci2 extends PublicSpeci1 {

	public static void main(String[] args) {
		
		// by using object 
		PublicSpeci1 pu = new PublicSpeci1();
		pu.empDetails();
		
		//by using extend
		PublicSpeci2 pu2 = new PublicSpeci2();
		pu2.empDetails();

	}

}
