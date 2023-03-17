package assignment1;

public class Java10 {

	public static void main(String[] args) {
		
		C c=new C();

	}

}

class A {
	public A() {
		System.out.println("Constructor of class A");
	}
	
}

class B extends A{
	public B() {
		System.out.println("Constructor of class B");
	}
}

class C extends B{
	int B;
	
}



