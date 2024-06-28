package org.kir;

public class AccessSpecifierClassA {
	
	protected void methodA() {
		// TODO Auto-generated method stub

	}

	public void methodB() {
		// TODO Auto-generated method stub

	}

	 private class InnerClass {
		    int y = 5;
		  }
	public static void main(String[] args) {
		AccessSpecifierClassA obj = new AccessSpecifierClassA();
		
		obj.methodA();
		
		obj.methodB();

	}
	
	

}
class OuterClass {
	  int x = 10;

	 
	}
