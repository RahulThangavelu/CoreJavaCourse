package org.accessmodi;

public class FinalModi {
	final int a=100;
	
	public final void empDetails() {
		System.out.println("emp id is 101");
		System.out.println("emp name is rahul");

	}
	
	public static void main(String[] args) {
		FinalModi fi = new FinalModi();
		fi.empDetails();
		System.out.println(fi.a);
	}

}
