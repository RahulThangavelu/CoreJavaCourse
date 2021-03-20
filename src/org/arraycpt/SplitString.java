package org.arraycpt;

public class SplitString {

	public static void main(String[] args) {
		
		String s = "Welcome to our java class";
		
		int  l= s.length();
		System.out.println(l);
		
		String[] sp = s.split(" ");
		int l1 = sp.length;
        System.out.println(l1);
        
        for(int i=0;i<l1;i++) {
        	System.out.println(sp[i]);
        }
        
        for(String x : sp) {
        	System.out.println(x);
        }
        
	}

}
