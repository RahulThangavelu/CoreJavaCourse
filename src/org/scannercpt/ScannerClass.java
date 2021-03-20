package org.scannercpt;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter your full name");
		String nl = s.nextLine();
        System.out.println(nl);
        
        System.out.println("Enter your id");
        byte nb = s.nextByte();
        System.out.println(nb);    
	
	    System.out.println("Enter your roll no");
	    short ns = s.nextShort();
	    System.out.println(ns);
	    
	    System.out.println("Enter your Phone No");
	    int ni = s.nextInt();
	    System.out.println(ni);
	    
	    System.out.println("Enter your Account no");
	    long nll = s.nextLong();
	    System.out.println(nll);
	    
	    System.out.println("Enter your Bank Balance");
	    float nf = s.nextFloat();
	    System.out.println(nf);
	    
	    System.out.println("Enter your Salary");
	    double nd = s.nextDouble();
	    System.out.println(nd);
	    
	    System.out.println("Enter your Nick name");
	    String n = s.next();
	    System.out.println(n);
	    
	}

}
