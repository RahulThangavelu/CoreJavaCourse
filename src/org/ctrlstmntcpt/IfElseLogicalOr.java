package org.ctrlstmntcpt;

public class IfElseLogicalOr {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		if(a<100 || b>100) {
			System.out.println("valid");
		}
		else {
			System.out.println("not valid");
		}
	}

}
