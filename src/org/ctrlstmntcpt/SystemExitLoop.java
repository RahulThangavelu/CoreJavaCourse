package org.ctrlstmntcpt;

public class SystemExitLoop {

	public static void main(String[] args) {
		for(int i=0;i<=10;i++) {
			if(i==5) {
				System.exit(0);
			}
			
			System.out.println("i value is "+i);
		}

	}

}
