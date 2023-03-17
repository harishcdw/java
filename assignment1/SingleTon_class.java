package assignment1;


public class SingleTon_class {
	
	public static void main(String[] args) {
		Hari h1=Hari.func();
		
	}
}

class Hari{
	private Hari() {
		System.out.println("Object created");
	}
	private static Hari obj;
	synchronized public static Hari func() {
		if(obj==null) {
			obj=new Hari();
		}
		return obj;
	}
}
