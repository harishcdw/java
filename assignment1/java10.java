package assignment1;

public class java10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c=new C();

	}

}

class A{
	public A() {
		System.out.println("Constructor of class A");
	}
	
}

class B{
	public B() {
		System.out.println("Constructor of class B");
	}
}

class C extends A{
	int B;
	
}
