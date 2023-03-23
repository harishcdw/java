package assignment3;

public class ThreadStart {

	public static void main(String[] args) {
		Thread t1 = new Thread(()->{
			System.out.println("haiii");
		});
		t1.start();
		t1.start();

	}

}
 