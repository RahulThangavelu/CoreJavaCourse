package org.exceptioncpt;

public class NumberFormatException {

	public static void main(String[] args) {
		
		String s = "123abc";
		
		int pi = Integer.parseInt(s);
        System.out.println(pi);
	}

}
