package org.ctrlstmntcpt;

public class IfNested {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		if(a>5) {
			if(b<15) {
				System.out.println("inner if");
			}
			else {
				System.out.println("inner else");
			}
			System.out.println("outer if");
		}
		else {
			System.out.println("outer else");
		}

	}

}
