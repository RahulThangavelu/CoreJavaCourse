package org.variablescpt;

public class LocalVariable {
	
	
	public void add() {
		int a = 10;
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		int a = 20;
		System.out.println(a);
		
		LocalVariable lv =new LocalVariable();
		lv.add();
		
		System.out.println(a);
		

	}

}
