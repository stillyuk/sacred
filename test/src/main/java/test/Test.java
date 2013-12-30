package test;

public class Test {

}

class A {
	public A() {
		System.out.println("A");
		new B();
	}
}

class B extends A {
	protected B() {
		
	}
	
	public static void main(String[] args) {
		new B();
	}
}