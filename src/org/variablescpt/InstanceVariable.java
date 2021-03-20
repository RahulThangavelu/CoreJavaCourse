package org.variablescpt;

public class InstanceVariable {
	
	public int a = 10;
	
	public void add() {
		a = 20;
		System.out.println(a);

	}
	
	public static void main(String[] args) {
       
	    int	a= 30;
	    
	    InstanceVariable iv = new InstanceVariable();
	    System.out.println(a);
	    
	    System.out.println(iv.a);
	    iv.add();
	    System.out.println(a);
		
		

	}

}
