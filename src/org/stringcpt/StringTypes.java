package org.stringcpt;

public class StringTypes {
	
	public static void main(String[] args) {
		
		String s1 = "Welcome";
		String s2 = "Welcome";
		String s3 = "Java";
		System.out.println("Literal String");
		int ih1 = System.identityHashCode(s1);
		System.out.println("s1 memory is "+ih1);
		
		int ih2 = System.identityHashCode(s2);
		System.out.println("s2 memory is "+ih2);
		
		int ih3 = System.identityHashCode(s3);
		System.out.println("s3 memory is "+ih3);
		
		System.out.println("Non-Literal String");
		String r1 = new String("Welcome");
		String r2 = new String("Welcome");
		String r3 = new String("Java");
		int ihr1 = System.identityHashCode(r1);
		System.out.println("r1 memory is "+ihr1);
		
		int ihr2 = System.identityHashCode(r2);
		System.out.println("r2 memory is "+ihr2);
		
		int ihr3 = System.identityHashCode(r3);
		System.out.println("r3 memory is "+ihr3);
		
		
		System.out.println("Immutable String");
		int ihi1 = System.identityHashCode(s1);
		System.out.println("s1 memory is "+ihi1);
		
		int ihi2 = System.identityHashCode(s2);
		System.out.println("s2 memory is "+ihi2);
		
		int ihi3 = System.identityHashCode(s3);
		System.out.println("s3 memory is "+ihi3);
		
		String concat = s2.concat(s3);
		System.out.println("concat is "+concat);
		int ihi4 = System.identityHashCode(concat);
		System.out.println("concat new memory is "+ihi4);
		
		
		System.out.println("Mutable String");
		StringBuffer m1 = new StringBuffer("Welcome");
		StringBuffer m2 = new StringBuffer("Welcome");
		StringBuffer m3 = new StringBuffer("Java");
		int ihm1 = System.identityHashCode(m1);
		System.out.println("m1 memory is "+ihm1);
		
		int ihm2 = System.identityHashCode(m2);
		System.out.println("m2 memory is "+ihm2);
		
		int ihm3 = System.identityHashCode(m3);
		System.out.println("m3 memory is "+ihm3);
		
		StringBuffer append = m2.append(m3);
		System.out.println("append is "+append);
		int ihm4 = System.identityHashCode(append);
		System.out.println("append share memory is "+ihm4);
		
		
		
		
		
		
		
		
		
		
	}

}
