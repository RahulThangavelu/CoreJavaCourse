package org.oopscpt;

public class PolyMethodOvl {
	
	
	public void empDetails(int i) {
		System.out.println("employee id is "+i);

	}
	
    public void empDetails(String s) {
		
    	System.out.println("employee name is "+s);
	}
    
    public void empDetails(String s,String s1) {
    	System.out.println("employee fathername is "+s);
    	System.out.println("employee mothername is is "+s1);

	}
    
   public void empDetails(char c,long l) {
	   System.out.println("employee initial is "+c);
	   System.out.println("employee phone is  "+l);

	}
   
   public void empDetails(long l,char c) {
	   System.out.println("employee account no is "+l);
	   System.out.println("employee father initial is "+c);

	}
   
   public static void main(String[] args) {
	
	   PolyMethodOvl mov = new PolyMethodOvl();
	   mov.empDetails(101);
	   mov.empDetails("Rahul");
	   mov.empDetails("Thangavelu", "Santhi");
	   mov.empDetails('T', 987654321);
	   mov.empDetails(12345678, 'S');
	   
	   
	   
	   
	   
	   
	   
	   
}

}
