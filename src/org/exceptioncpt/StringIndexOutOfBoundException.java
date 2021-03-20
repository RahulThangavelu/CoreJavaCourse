package org.exceptioncpt;

public class StringIndexOutOfBoundException {

	public static void main(String[] args) {
		
		String s = "Hello";
		char c = s.charAt(7);
        System.out.println(c);
	}

}
