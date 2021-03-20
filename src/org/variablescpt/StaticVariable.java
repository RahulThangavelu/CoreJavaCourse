package org.variablescpt;

public class StaticVariable {
	
	public static int a = 10;
	
	public void add() {
		a = 20;
		System.out.println(a);

	}

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		a = 30;
		StaticVariable sv = new StaticVariable();
		System.out.println(a);
		System.out.println(sv.a);
		sv.add();
		System.out.println(sv.a);
		System.out.println(a);
		
		

	}

}
