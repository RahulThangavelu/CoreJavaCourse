package org.accessspeci2;

import org.accessspeci1.PublicSpeci1;


public class PublicSpeci3 extends PublicSpeci1 {

	public static void main(String[] args) {
		// by using object 
				PublicSpeci1 pu = new PublicSpeci1();
				pu.empDetails();
				
				//by using extend
				PublicSpeci3 pu3 = new PublicSpeci3();
				pu3.empDetails();

	}

}
