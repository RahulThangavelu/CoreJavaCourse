package org.exceptioncpt;

public class NullPointerException {

	@SuppressWarnings("null")
	public static void main(String[] args) {

       String s = null;
       
       char c = s.charAt(2);
		System.out.println(c);

	}

}
