package assignment3;



import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Inventory {

	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(2);
		Product p = new Product();
		es.execute(()->{
			for(int i=0;i<5;i++)
				p.producer();
		});
		
		es.execute(()->{
			for(int i=0;i<5;i++)
				p.consumer();
		});
		
		es.shutdown();

	}

}

class Product{
	boolean flag;
	synchronized public void producer() {
		if(flag) {
			try {
				wait();
			}
			catch(Exception e) {
				
			}
		}
		System.out.println("Product produced");
		flag=true;
		notify();
	}
	
	synchronized public void consumer() {
		if(!flag) {
			try {
				wait();
			}
			catch(Exception e) {
				
			}
		}
		System.out.println("Product consumed");
		flag=false;
		notify();
	}
}