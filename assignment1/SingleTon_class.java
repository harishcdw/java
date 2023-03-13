package assignment1;

public class SingleTon_class {
	public static void main(String[] args) {
		hari h1= hari.singletonClass();
		
		hari h2= hari.singletonClass();
	}
}

class hari{
	static hari obj = new hari();
	private hari() {
		System.out.println("Hi everyone");
	}
	public static hari singletonClass() {
		return obj;
	}
}

