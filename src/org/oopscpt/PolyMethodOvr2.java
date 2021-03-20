package org.oopscpt;

public class PolyMethodOvr2 extends PolyMethodOvr1  {
	
	public void empResult(String r) {
		System.out.println("employee result is "+r);

	}
	
	 @Override
	public void empEng(int i) {
		System.out.println("emp eng mark is "+i);
	}
	 
	 @Override
	public void empTam(int i) {
		System.out.println("emp tam mark is "+i);
	}
	 
	 public static void main(String[] args) {
		 PolyMethodOvr2 mor = new PolyMethodOvr2();
		 mor.empName("Rahul");
		 mor.empEng(85);
		 mor.empTam(95);
		 mor.empResult("Pass");
	}

}
