package org.accessspeci1;

public class DefaultSpeci2 extends DefaultSpeci1 {

	public static void main(String[] args) {

          // by using object
		DefaultSpeci1 de = new DefaultSpeci1();
		de.empDetails();
		
		//by using extends
		DefaultSpeci2 de2 =new DefaultSpeci2();
		de2.empDetails();
		

	}

}
