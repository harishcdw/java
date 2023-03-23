package assignment3;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EvenOdd {

	public EvenOdd() {
		ExecutorService es=Executors.newFixedThreadPool(5);
		es.execute(()->{
			for(int i=1;i<=100;i=i+2)
			{
				System.out.println(i);
			}
		});
			
		es.execute(()->{
			for(int i=2;i<=100;i=i+2)
			{
				System.out.println(i);
			}
			
		});
			
		es.shutdown();
	}
	public static void main(String[] args) {
		new EvenOdd();
		
	}

}




