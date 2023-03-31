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
	int count=0;
	synchronized public void producer() {
		if(count==0) {
			try {
				wait();
			}
			catch(Exception e) {
				
			}
		}
		System.out.println("Product produced");
		count=1;
		notify();
	}
	
	synchronized public void consumer() {
		if(count==1) {
			try {
				wait();
			}
			catch(Exception e) {
				
			}
		}
		System.out.println("Product consumed");
		count=0;
		notify();
	}
}