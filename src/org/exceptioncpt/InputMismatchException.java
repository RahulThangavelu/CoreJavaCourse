package org.exceptioncpt;

import java.util.Scanner;

public class InputMismatchException {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your Id");
		int ni = s.nextInt();
        System.out.println(ni);
	}

}
