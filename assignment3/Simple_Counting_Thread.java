package assignment3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Simple_Counting_Thread {
	
	public Simple_Counting_Thread() {
		ExecutorService es = Executors.newFixedThreadPool(1);
		es.execute(()->{
			for(int i=0;i<100;i++) {
				if(i%10==0) {
					System.out.println("Simple_counting_Thread");
				}
				try {
					Thread.sleep(1000);
				}
				catch(Exception e) {
					System.err.println(e);
				}
			}
		});
	}

	public static void main(String[] args) {
		new Simple_Counting_Thread();
	}

}
