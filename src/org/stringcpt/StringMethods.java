package org.stringcpt;

public class StringMethods {
	
	public static void main(String[] args) {
		String s1 = "Rahul Thangavel";
		String s2 = "rahul thangavel";
		String s3 = "  santhi sabitha  ";
		
		int length = s1.length();
		System.out.println("length is "+length);
		
	    boolean empty = s1.isEmpty();	
	    System.out.println("empty is "+empty);
	
	    int indexOf = s1.indexOf('a');
	    System.out.println("indexOf is "+indexOf);
	
	    int lastIndexOf = s1.lastIndexOf('a');
	    System.out.println("lastIndexOf is "+lastIndexOf);
	
	    char charAt = s1.charAt(6);
	    System.out.println("charAt is "+charAt);
	
	    String upperCase = s2.toUpperCase();	
	    System.out.println("upperCase is "+upperCase);
	
	    String lowerCase = s1.toLowerCase();
	    System.out.println("lowerCase is "+lowerCase);
	
	    String substring = s1.substring(4);
	    System.out.println("substring is "+substring);
	    
	    String substring2 = s1.substring(4, 7);
	    System.out.println("substring2 is "+substring2);
	
	    boolean equals = s1.equals(s2);
	    System.out.println("equals is "+equals);
	    
	    boolean equalsIgnoreCase = s1.equalsIgnoreCase(s2);
	    System.out.println("equalsIgnoreCase is "+equalsIgnoreCase);
	
	    boolean contains = s1.contains("Rahul T");
	    System.out.println("contains is "+contains);
	    
	    boolean startsWith = s1.startsWith("Rah");
	    System.out.println("startsWith is "+startsWith);
	    
	    boolean endsWith = s1.endsWith("vel");
	    System.out.println("endsWith is "+endsWith);
	    
	    String replace = s1.replace('a', '7');
	    System.out.println("replace is "+replace);
	    
	    String trim = s3.trim();
	    System.out.println("trim is "+trim);
	    
	    
	    
	    
	    
	    
	    
	
	
	}

}
